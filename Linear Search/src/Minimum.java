public class Minimum {
    public static void main(String[] args) {
        int [] nums = {23,45,1,2,8,19,-3,16,-11,28};
        System.out.println(min(nums));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<ans){
                ans=arr[i];
            }

        }
        return ans;
    }
}
