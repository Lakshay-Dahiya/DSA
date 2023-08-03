import java.util.Arrays;
import java.util.Scanner;

public class VariableLengthArguments {
    public static void main(String[] args) {
        fun(2,3,4,5,56,87,23); //output:[2,3,4,5,56,87,23]
        fun();                    //output:[]

    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
}
