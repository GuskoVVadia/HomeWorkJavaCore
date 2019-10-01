class HW {

    static final int SIZE = 1_000_000;                //размер массива
    int countThreads = 2;                       //количество потоков

    float[] array;
    float[] arrayFin;

    HW(){
        this.array = fullArrayByOne(SIZE);  //создаём массив с указанным размером и заполняем его значением 1
        this.arrayFin = new float[SIZE];    //массив-вывода результата, соразмерен array
    }


    public static void main(String[] args) {
        HW a = new HW();                            //создаём экземпляр объекта

        //вызов метода с вычислением просто в потоке.
        a.methodOne(a.array);

        //вызываем метод для вычислений с одним потоком для вычислений
//        a.methodTwo(a.array);

        // вызываем метод для вычислений с countThreads количеством потоков.
//        a.methodThree(a.array, a.countThreads);

    }



    void methodOne(float[] array){
        long timer = System.currentTimeMillis();

        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                    Math.cos(0.4f + i / 2));
        }
        setArrayFin(array, 0);

        System.out.print("methodOne с потоком: " + Thread.currentThread().getName() + " отработал: ");
        System.out.println(System.currentTimeMillis() - timer);
    }

    void methodTwo(float[] array){
        new Thread(new Runnable() {
            @Override
            public void run() {
                long timer = System.currentTimeMillis();

                float[] arrayLocal = array;

                for (int i = 0; i < arrayLocal.length; i++) {
                    arrayLocal[i] = (float) (arrayLocal[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                            Math.cos(0.4f + i / 2));
                }

                setArrayFin(arrayLocal, 0);

                System.out.print("methodTwo с потоком " + Thread.currentThread().getName() + " отработал: ");
                System.out.println(System.currentTimeMillis() - timer);
            }
        }).start();
    }

    void methodThree(float[] array, int countThreads){
        int len = array.length;                           // длинна массива.
        //countThreads                                      //сколько потоков
        int step = len / countThreads;                     // какой шаг?
        int balance = len % countThreads;                  // какой остаток?
        int stepThread = 0;                                 // какой шаг массива у потока?

        for (int i = 0; i < countThreads; i++) {
            int lenLocalArray = 0;
            if (!(balance == 0) && (i == (countThreads - 1))) {
                lenLocalArray = balance;
            }
            int localStepThread = stepThread;               //шаг массива с новыми данными
            int finalLenLocalArray = lenLocalArray;

            new Thread(new Runnable() {
                @Override
                public void run() {
                    long localTimer = System.currentTimeMillis();

                    float[] copyArray = new float[step + finalLenLocalArray];
                    System.arraycopy(array, localStepThread, copyArray, 0, copyArray.length);

                    for (int i = 0; i < copyArray.length; i++) {
                        copyArray[i] = (float) (copyArray[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                                Math.cos(0.4f + i / 2));
                    }

                    setArrayFin(copyArray, localStepThread);

                    System.out.print("поток " + Thread.currentThread().getName() + " справился за: ");
                    System.out.println(System.currentTimeMillis() - localTimer);

                }
            }).start();
            stepThread = stepThread + step;

        }
    }

    static float[] fullArrayByOne(int value){
        float[] a = new float[value];
        for (int i = 0; i < value; i++) {
            a[i] = 1;
        }
        return a;
    }

    synchronized void setArrayFin(float[] childArray, int beginValue){
        System.arraycopy(childArray, 0, arrayFin, beginValue, childArray.length);
        System.out.println("thread " + Thread.currentThread().getName() + " закончил работу по слиянию.");
    }
}
