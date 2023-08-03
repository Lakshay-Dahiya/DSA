import java.util.Arrays;

public class VarArgs2 {
    public static void main(String[] args) {
        multiple(2,3,"lucky","akshat","arnav","shivansh");
    }
    static void multiple(int x,int b,String...v){
        System.out.println(x);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
}
