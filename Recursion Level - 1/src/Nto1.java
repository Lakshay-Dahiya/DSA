public class Nto1 {
    public static void main(String[] args) {
        fun(5);
    }
    public static void fun(int n){
        if(n==0){
            return;  // base condition
        }
        System.out.println(n);
        fun(n-1);
       // System.out.println(n); this prints 1 to N

    }
}
