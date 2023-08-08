public class BubbleSort {
    public static void main(String[] args) {
        int [] arrr = {-1,7,-32,0,89};
        System.out.println(Arrays.toString);
    }
    static void bubble(int[] arr){
        boolean swapped;
        for (int i = 0; i< arr.length ;i++){
            swapped = false;  // imp to stop checking when array is sorted
            for ( int j=0; j< arr.length -i ; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j]; //swap
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
        }if (!swapped){ // !false = true , also if( !swapped == true) , to stop the program to save time
            break;
        }
        /*  this statement says that if after iteration of loop , if (!swapped==true) then ,
        no further elements left for sorting  and if sorting hast to continue then ,
          (!swapped) will be false and it continues  */
    }
}
