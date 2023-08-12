import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int [] arr = {4,3,2,1};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
        missingnumber(arr);
        System.out.println(missingnumber(arr));
    }

    static void bubblesort(int[] arr) {
        int i = 0;
        while (i<arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }
    static void swap(int [] arr ,int first ,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int missingnumber(int [] arr){
        int count = 0;
        int n = 5;
        for (int i = 0; i < n; i++) {
            if(arr[i] == arr[count]){
                count++;
            }else if( n > arr.length){
                break;
            }
        }return count;
    }
}
