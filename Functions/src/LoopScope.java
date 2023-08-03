public class LoopScope {
    public static void main(String[] args) {
        int a;
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int n=10;
          //  int a=20; // a is already initialised above that's why error
            a=20;
        }
        //System.out.println(i); // error because i is of the 'for' loop scope
    int i = 45;
    }
}
