package ExceptionArrayString;

/*
Класс с методом, созданным по ТЗ.
В классе описаны два метода convertStringArrayInt(), convertStringArrayDouble().
Метод convertStringArrayInt() - принимает массив и конвертирует его из String в int, если String запись исключительно
    целочисленная, если же нет - выбрасывает исключение.
Метод convertStringArrayDouble() - принимает массив и конвертирует его из String в int, и значение String не обязательно
 должно быть целочисленным, т.к. происходит конвертация и округляет полученный результат методом Math.round(). На
 выход тоже выводит сумму массива в int.
Оба метода отмечена как static - для простоты, с этой же целью main не вынесен в отдельный класс.
А в теле catch перехватываем два исключения, которые по идее могут возникнуть в массиве при решении поставленной задачи.
 */

class ArrayTest {

    static int convertStringArrayInt(String[][] array) throws MyArraySizeException, MyArrayDataException{

        int Sum = 0;

        if (!((array.length == 4) && (array[0].length == 4)))
            throw new MyArraySizeException("массив должен быть размерами 4 * 4");

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                    try {

                        Sum += Integer.valueOf(array[i][j]);

                    } catch (NumberFormatException | NullPointerException e) {
                        throw new MyArrayDataException(i+1, j+1);
                    }
                }
            }

        return Sum;
    }

    static int convertStringArrayDouble(String[][] array) throws MyArraySizeException, MyArrayDataException{

        int Sum = 0;

        if (!((array.length == 4) && (array[0].length == 4)))
            throw new MyArraySizeException("массив должен быть размерами 4 * 4");

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                try {

                        Sum += Math.round(Double.valueOf(array[i][j]));

                } catch (NumberFormatException | NullPointerException e) {
                    throw new MyArrayDataException(i+1, j+1);
                }
            }
        }

        return Sum;
    }

    public static void main(String[] args){

        String[] a = new String[4];
        String[][] a2 = new String[2][4];
        String[][] a3 = new String[4][1];
        String[][] a4 = new String[5][7];
        String[][] a5 = new String[4][4];
        String[][][] a6 = new String[0][][];
        String[][] link1 = {{"1", "0", "3", "4"}, {"1.1", "2.2", "3.3", "4.4"},
                {"1", "2", "3", "4"}, {"1", "2", "l", "4"}};
        String[][] link2 = {{"1", "2", "3", "4"}, {"1.1", "2.2", "3.3", "4.4"},
                {"11", "-2", "3", "+4"}, {"0.1", " ", "0", "4"}};
        String[][] link3 = {{"1", "2", "3", "4"}, {"1.1", null, "3.3", "4.4"},
                {"11", "-2", "3", "+4"}, {"0.1", "0.2", "0", "4"}};
        String[][] link4 = {{"1", "2", "3", "4"}, {"1.1", "2", "3.3", "4.4"},
                {"11", "-2", "3", "+4"}, {"0.1", "0.2", "0", "4.9"}};
        String[][] norm = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"},
                {"110", "-20", "30", "40"}, {"0", "2", "0", "4"}};


        try {
            System.out.println(ArrayTest.convertStringArrayInt(norm));
            System.out.println(ArrayTest.convertStringArrayDouble(link4));

        } catch (MyArraySizeException | MyArrayDataException e){
            System.err.println(e);
        }
    }
}
