import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(7);
        list.add(53);
        list.add(23);
        list.add(98);
        list.add(12);
        System.out.println(list);
        System.out.println(list.contains(55));
        list.set(0,1000);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
