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

        System.out.println("=== Исходная матрица ===");
        for (int[] aMatrix : matrix) {
            for (int anAMatrix : aMatrix) {
                System.out.print(anAMatrix + "\t");
            }
            System.out.println();
        }

        System.out.println("Сумма элементов матрицы: " + sumMatrixElements(matrix));

        int[][] transMatrix = transposeMatrix(matrix);

        System.out.println("=== Транспонированая матрица ===");
        for (int[] tMatr : transMatrix) {
            for (int tranMatrix : tMatr) {
                System.out.print(tranMatrix + "\t");
            }
            System.out.println();
        }


    }

    public static int sumMatrixElements(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix){
            for (int element : row) {
                sum += element;
            }
        }
        return sum;
    }
    public static int [][] transposeMatrix (int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}
