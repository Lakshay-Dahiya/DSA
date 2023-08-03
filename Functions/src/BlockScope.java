public class BlockScope {
    public static void main(String[] args) {
        int a=7;
        {
            a=5;
            int c=9;
        }
        /* System.out.println(c); // c is out of scope because it belongs to the upper block only */
        System.out.println(a);
    }
}
