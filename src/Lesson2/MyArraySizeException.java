package Lesson2;

public class MyArraySizeException extends Exception {

    public MyArraySizeException(int lengthArray) {
        super("Размер массива не равен " + lengthArray + ". Вычисление отменено!");
    }
}
