import java.util.Scanner;
public class Trianistar{
    public static void main(String[] args){
        Scanner numScan = new Scanner(System.in);

        System.out.println("Input height: ");
        int height = numScan.nextInt();
        int space = height - 1;
        for (int i = 1;i <= height;i++) {
            for (int j = 0;j < space;j++) {
                System.out.print(" ");
            }
            space = space - 1;
            for (int k = 0;k < 2 * i - 1;k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}