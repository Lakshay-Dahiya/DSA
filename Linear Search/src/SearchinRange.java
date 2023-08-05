public class SearchinRange {
    public static void main(String[] args) {

        int[] nums = {23,45,1,2,8,19,-3,16,-11,28};
        int target = 19;
        int start =2;
        int end =9;
        int ans = linearSearch(nums,target,start,end);
        System.out.println(ans);

    }

    static int linearSearch(int[] arr, int target,int start,int end) {
        if (arr.length==0){
            return -1;
        }
        for (int index   = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}