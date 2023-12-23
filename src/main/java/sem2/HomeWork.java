package sem2;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("countEvens([2, 1, 2, 3, 4]) -> " + countEvens(new int[]{2, 1, 2, 3, 4}));
        System.out.println("countEvens([2, 2, 0]) -> " + countEvens(new int[]{2, 2, 0}));
        System.out.println("countEvens([1, 3, 5]) -> " + countEvens(new int[]{1, 3, 5}));

        System.out.println("Разница между самым большим и самым маленьким элементами массива [1, 3, 0, 5, 9, -1, " +
                "-5] равна: " + diffMaxMin(new int[]{1, 3, 0, 5, 9, -1, -5}));

        System.out.println("В исходном массиве [1, 3, 0, 5, 9, -1, -5] есть два соседних элемента с нулевым " +
                "значением? - " + checkZero(new int[]{1, 3, 0, 5, 9, -1, -5}));
        System.out.println("В исходном массиве [0, 3, -5, 5, 9, -1, 10, 0, 0] есть два соседних элемента с нулевым " +
                "значением? - " + checkZero(new int[]{0, 3, -5, 5, 9, -1, 10, 0, 0}));
    }

    //Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3
    // countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
    private static int countEvens(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    //Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого
    //массива.
    private static int diffMaxMin(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i : arr) {
            if (min > i) {
                min = i;
            } else if (max < i) {
                max = i;
            }
        }
        return max - min;
    }

    //Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента с нулевым значением.
    private static boolean checkZero(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }
}