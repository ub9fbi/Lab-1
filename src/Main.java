import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество строк матрицы (n)");
        int n = scanner.nextInt();

        System.out.println("Ввведите количество столбцов матрицы (m)");
        int m = scanner.nextInt();

        Matrix matrix = new Matrix();
        matrix.inputMatrix(n,m);

    }
}

class Matrix {

    public int n,m;
    int matrix [][]  = new int[n][m];
    public Matrix() {

    }
    // ввод элементов матрицы


    public void inputMatrix(int n,int m){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите элементы матрицы");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Строка матрицы " + i + " номер элемента: " + j + " : ");
                matrix [i][j] = scanner.nextInt();
            }
        }
    }
    // Транспонированная матрица
    public void transMatrix(int matrix [][]){
        System.out.println("=== Транспонированая матрица ===");
        int transponMatrix [][]  = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transponMatrix[i][j] = matrix[j][i];
                System.out.print(transponMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
    // суммирование матрицы
    public void sumMatrixElements(int matrix [][]) {
        int sum = 0;
        for (int[] row : matrix){
            for (int element : row) {
                sum += element;
            }
        }
    }
}



