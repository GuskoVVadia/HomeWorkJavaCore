package ExceptionArrayString;
/*
    Класс, созданый по ТЗ, расширяет класс Exception.
    В поле stateInException - нет прямой необходимости, но для полноты картины дополняет информацию об ошибке,
        в случае необходимости описание можно дополнить, как и сделано в main, а можно воспользоваться и
        пустым конструктором.
 */

public class MyArraySizeException extends Exception{

    private String stateInException;

    MyArraySizeException(String stateInException){
        this.stateInException = stateInException;
    }
    MyArraySizeException(){
        stateInException = " размерность указана неверно!";
    }

    @Override
    public String toString() {
        return "Не соответствие размеру: " + stateInException;
    }
}
