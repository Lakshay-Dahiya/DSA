public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));

    }
    static int findNumbers(int[] nums){
        int count=0;
        for(int num:nums){
            if (even(num)) {
                count++;
            }
        }return count;
    }
    static boolean even(int num){
        int numberofDigits = digits(num);
        if(numberofDigits % 2 ==0){
            return true;
        }return false;//
    }
    /* this function counts number of digits */
    static int digits(int num){
        if(num < 0)
        {
            num = num * -1; // for negative numbers
        }
        if (num==0){
            return 1; //if num =0, it has 1 digit
        }
        int count = 0;
        while(num>0){
            count++;
            num/=10; //num=num/10;

        }return count;//this is slower than digits2 because while loop runs for every number

    }
    static int digits2(int num){
        if(num < 0)
        {
            num = num * -1; // for negative numbers
        }
        return (int)(Math.log10(num)) + 1;//shortcut to find number of digits
    }
}
