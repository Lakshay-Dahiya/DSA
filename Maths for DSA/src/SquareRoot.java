public class SquareRoot {
    public static void main(String[] args) {
        int n = 15;
        int p = 3; // precision value , it tells number of decimals we need for square root
        System.out.println(sqrt(n,p));
    }
    static double sqrt(int n, int p){
        double root = 0.0;
//        int s = 0; //start value
//        int e = n; //end value
//        while(s<=e){
//            int m = s + (e-s)/2 ;        //binary search
//            if(m*m == n){
//                return m;
//            }
//            else if(m*m < n){
//                s = m+1;
//            }
//            else{
//                e = m-1;
//            }
//        }


        //finding decimal values
        double incr = 0.1; //increment
        for(int i = 0; i<p ; i++){
            while(root * root < n){
                root += incr;
                System.out.println(root + "yoyoy");
            }
            root -= incr;  //subtracting once to get back to correct value of root
            incr /= 10;    //add 0.1 then 0.01 then 0.001 , that's why we do this
        }return root;
    }
}
