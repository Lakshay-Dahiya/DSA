public class PrimeOptimised {
    public static void main(String[] args) {
        int limit = 30;
        for(int i=0 ; i<=limit ; i++){
            System.out.println((i + " " + isPrime(i)));
        }
    }
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int c = 2;
        while(c*c <= n){
            if(n%c==0){
                return false;
            }
            c++;
        }return true;
    }
}
