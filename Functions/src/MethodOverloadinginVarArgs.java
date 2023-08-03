import java.util.Arrays;

public class MethodOverloadinginVarArgs {
    public static void main(String[] args) {
        demo(2,3,4);
        demo("lucky","shivansh");
    }
    static void demo(int...v){
        System.out.println(Arrays.toString(v)); //[2,3,4]

    }
    static void demo(String...v){
        System.out.println(Arrays.toString(v)); //[lucky,shivansh]
    }
}
