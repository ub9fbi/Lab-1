import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк матрицы (n)");
        int n = scanner.nextInt();
        System.out.println("Ввведите количество столбцов матрицы (m)");
        int m = scanner.nextInt();

        System.out.println("Введите элементы матрицы");

        int[][] matrix = new int[n][m];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Строка матрицы " + i + " номер элемента: " + j + " : ");
                matrix [i][j] = scanner.nextInt();
            }
        }

        System.out.println("=== Матрица ===");
        for (int[] aMatrix : matrix) {
            for (int anAMatrix : aMatrix) {
                System.out.print(anAMatrix + "\t");
            }
            System.out.println();
        }

        System.out.println("Сумма элементов матрицы - " + sumOfMatrixElements(matrix));

    }
    // метод суммирования элементов матрицы
    public static int sumOfMatrixElements(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix){
            for (int element : row) {
                sum += element;
            }
        }
        return sum;
    }
}
