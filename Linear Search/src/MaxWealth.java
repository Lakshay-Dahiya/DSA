public class MaxWealth {
    public static void main(String[] args) {


    }
    public int maximumWealth(int[][ accounts]){
        //person=row , account=column
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < acoounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum= sum + accounts[person][account];
            }
            
            if(sum > ans){
                ans = sum;
            }
        }

        return ans;
    }
}