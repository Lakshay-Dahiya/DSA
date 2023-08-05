import java.util.Arrays;

public class Searchin2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target= 56;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
        int max= max(arr);
        System.out.println((max));
    }
    static int[] search(int[][] arr ,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }return new int[]{-1,-1};// writing new because this is not initialised before
    }
    static int max(int[][]arr){
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>max){
                    max= arr[i][j];
                }
            }
        }return max;
    }
}