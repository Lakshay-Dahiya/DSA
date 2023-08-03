import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner x = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(x.nextInt());

        }
        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");

        }
    }
}
