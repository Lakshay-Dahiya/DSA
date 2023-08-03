import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray2 {
    public static void main(String[] args) {
        int [][] arr = new int[3][2];
        System.out.println(arr.length);
        Scanner x =new Scanner(System.in);

        //Input

        for (int row = 0; row < arr.length; row++) {

            //for each column in every row

            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]= x.nextInt();
            }
        }
        // Output

        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");

            }
            System.out.println();
        }

        //Output 2nd way
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));

        }

        //Output 3rd Way
        for (int[] num :
                arr) {
            System.out.println(Arrays.toString(num));
        }
    }
}
