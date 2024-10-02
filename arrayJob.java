import java.util.Scanner;
import java.util.Arrays;
public class arrayJob{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Input array size: ");
        int n = scan.nextInt();
        System.out.println("Input array elements: ");
        int[] array = new int[n];
        int arraySum = 0;
        for (int i = 0;i < n;i++) {
            array[i] = scan.nextInt();
            arraySum += array[i];
        }
        Arrays.sort(array);
        float arrayAverage = arraySum / n;
        System.out.println("Sorted array: ");
        for (int i = 0;i < n;i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nSum of array: " + arraySum);
        System.out.println("Average value of array: " + arrayAverage);
    }
}