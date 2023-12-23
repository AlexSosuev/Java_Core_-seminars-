package sem2;

//Создать квадратный целочисленный массив (количество строк и столбцов одинаковое), заполнить
// его диагональные элементы единицами, используя цикл(ы)
public class Main {
    public static void main(String[] args) {
        int[][] mas = new int[5][5];
        for (int i=0; i<mas.length; i++) {
            mas[i][i] = mas[i][mas.length-i-1] = 1;
        }
        for (int[] ma : mas) {
            for (int j = 0; j < mas.length; j++) {
                System.out.print(ma[j] + " ");
            }
            System.out.println();
        }
    }
}
