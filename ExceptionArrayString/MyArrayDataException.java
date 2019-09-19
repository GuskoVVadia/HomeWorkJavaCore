package ExceptionArrayString;

/*
Класс MyArrayDataException создан по ТЗ, и расширяет класс Exception.
Принимает значения и генерирует локацию ошибки.
 */

public class MyArrayDataException extends Exception{

    private int i, j;

    MyArrayDataException(int i, int j){
        this.i = i;
        this.j = j;
    }

    @Override
    public String toString() {
        return "Ошибка аргумента в массиве: " + i + " строка, " + j + " столбец.";
    }
}
