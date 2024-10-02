import java.util.Scanner;
import java.util.Arrays;
public class matrixJob{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Input matrix size: ");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int[][] matrix1 = new int[x][y];
        int[][] matrix2 = new int[x][y];
        int[][] matrixSum = new int[x][y];
        System.out.println("Input first matrix elements: ");
        for (int i = 0;i < x;i++) {
            for (int j = 0;j < y;j++) {
                matrix1[i][j] = scan.nextInt();
            }
        }
        System.out.println("Input second matrix elements: ");
        for (int i = 0;i < x;i++) {
            for (int j = 0;j < y;j++) {
                matrix2[i][j] = scan.nextInt();
                matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("The sum of two matrixes: ");
        for (int i = 0;i < x;i++) {
            for (int j = 0;j < y;j++) {
                System.out.print(matrixSum[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}