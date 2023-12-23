package sem2;

import java.util.Arrays;

//Написать функцию добавления элемента в конец массива таким образом, чтобы она расширяла массив при необходимости.
//Функция должна возвращать ссылку на вновь созданный внутри себя массив, а не использовать глобальный.
public class Main2 {
    public static void main(String[] args) {
        int[] mas = new int[4];
        System.out.println(Arrays.toString(newArray(mas, 7)));
    }

    private static int[] newArray (int[] arr, int newElem) {
        int[] newMas = new int[arr.length+1];
        System.arraycopy(arr, 0, newMas, 0, arr.length);
        newMas[newMas.length-1] = newElem;
        return newMas;
    }
}
