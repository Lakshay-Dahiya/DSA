public class SieveMethod {
    public static void main(String[] args){
        int n =40;
        boolean [] primes = new boolean[n+1];
        seive(n,primes);

    }
    static void seive(int x , boolean[] primes){
        for(int i=2 ; i*i<=x ; i++){

            if(!primes[i]){
                for(int j=2*i; j<=x ; j+=i){
                    primes[j] = true;
                }
            }
        }
        for(int i=2 ; i<=x ; i++){
            if(!primes[i]){
                System.out.print(i + " ");
            }
        }
    }
}
