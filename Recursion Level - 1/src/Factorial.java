public class Factorial {
    public static void main(String[] args) {
       // fact(5);
        System.out.println(fact(5));
    }
    public static int fact(int n){
        if(n <= 1){
            return 1;
        }
        int ans = n * fact(n-1);
        return ans; //or return n * fact(n-1)
    }
}
