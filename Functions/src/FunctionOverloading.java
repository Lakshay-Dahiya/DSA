public class FunctionOverloading {
    public static void main(String[] args) {
        fun(77);
        fun("lakshay"); //2 functions can have same name if they have different arguments
        int ans = sum(3,4);
        System.out.println(ans);
    }
    static void fun(int a){

        System.out.println(a);
    }
    static void fun(String name){

        System.out.println(name);
    }
    static int sum(int x , int y){
        int sum = x+y;
        return sum;
    }
}
