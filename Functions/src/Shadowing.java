public class Shadowing {
    static int x=90;
    public static void main(String[] args) {
        System.out.println(x);  //90
        int x=40;
        System.out.println(x);  //40
        fun();
        int y;
        // System.out.println(y); // error because y not initialised only declared
    }
    static void fun(){
        System.out.println(x);  //90

    }

}
