
//1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4, при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать. Если в каком-то элементе массива преобразование не удалось
//(например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
//3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException, и вывести результат расчета.

package Lesson2;

public class MainException {
    public static void main(String[] args) {

        String[][] array1 = {{"4", "5", "3", "2"},
                {"4", "5i", "3", "2"},
                {"4", "5", "3", "2"},
                {"4", "5", "3", "2"}};

        String[][] array2 = {{"4", "5", "3", "2"},
                {"4", "5", "3", "2"},
                {"4", "5", "3", "2"}};

        String[][] array3 = {{"4", "5", "3", "2"},
                {"4", "5", "3", "2"},
                {"4", "5", "3", "2"},
                {"4", "5", "3", "2"}};


        //Я решил не выносить обработку исключений за пределы метода, что бы сократить код
        //только я так и не смог добиться последовательного вывода сообщений и ошибок
        System.out.println("Обрабатываем массив 1");
        summArray(array1);
        System.out.println("Обрабатываем массив 2");
        summArray(array2);
        System.out.println("Обрабатываем массив 3");
        summArray(array3);
    }

    static void summArray(String[][] array) {
        try {
            int lengthArray = 4;
            if (array.length != lengthArray) {
                throw new MyArraySizeException(lengthArray);
            }

            for (int i = 0; i < array.length; i++) {
                if (array[i].length != lengthArray) {
                    throw new MyArraySizeException(lengthArray);
                }
            }

            Double summ = 0.0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    try {
                        summ += Double.parseDouble(array[i][j]);
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                        System.out.println("В массиве, в строке " + (i + 1) + " и столбце " + (j + 1) + " введено не число, а: " + array[i][j]);
                    }
                }
            }
            System.out.println("Проссумировав все значения мы получили: " + summ);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }
}
