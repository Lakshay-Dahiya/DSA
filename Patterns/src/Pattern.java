public class Pattern {
    public static void main(String[] args) {
        pattern28(5);
    }
    static void pattern28(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalColsinRow = row > n ? 2*n - row : row;
            int totalSpaces = n -totalColsinRow ;
            for (int s = 0; s < totalSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsinRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int row = 0; row <= 2*n; row++){
            int totalColsinRow = row > n ? 2*n - row : row ;
            for (int col = 0; col < totalColsinRow; col++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    static void pattern4(int n){
        for(int row = 1; row <=n ; row++){
            for(int col = 1; col <= row ; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }
    static void pattern3(int n){
        for(int row = 1; row <=n ; row++){
            for(int col = 1; col <= n- row +1 ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void pattern2 (int n){
        for(int row = 1; row <=n ; row++){
            for(int col = 1; col <= row ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}







