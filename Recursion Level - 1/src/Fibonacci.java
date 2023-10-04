public class Fibonacci {
    public static void main(String[] args) {
        // fib(5);
        System.out.println(fib(5));
        // int finalans= fib(5)
        // sout(finalans);
    }
    public static int fib(int n){
        if(n < 2){
            return n;
        }
        int ans = fib(n-2) + fib(n-1);
        return ans;
        //rerurn fib(n-2) + fib(n-1)

    }
}
