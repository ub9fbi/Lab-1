import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк и столбцов матрицы (через пробел)");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Matrix matrix = new Matrix(n, m);

        matrix.inputMatrix();
        matrix.transposeMatrix();
        matrix.printTransposedMatrix();
        matrix.sumMatrixElements();
    }
}

class Matrix {

    public int n, m;
    public int[][] matrix;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        matrix = new int[n][m];
    }

    // ввод элементов матрицы
    public void inputMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элементы матрицы");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Транспонированная матрица
    public void transposeMatrix() {
        int[][] transposedMatrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }
        matrix = transposedMatrix; // заменяем изначальную матрицу на транспонированную
    }

    // Вывод транспонированной матрицы
    public void printTransposedMatrix() {
        System.out.println("Транспонированная матрица:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Сумма элементов матрицы
    public void sumMatrixElements() {
        int sum = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
            }
        }
        System.out.println("Сумма элементов матрицы: " + sum);
    }
}