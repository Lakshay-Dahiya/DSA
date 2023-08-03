//INPUT AND OUTPUT IN ARRAYS

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        int [] arr = new int[5];           //same procedure for string type arrays
        Scanner x = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]= x.nextInt();          // x.next() in string type
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        System.out.println(Arrays.toString(arr));

        for (int num :
                arr) {
            System.out.print(num + " ");
        }
    }
}
