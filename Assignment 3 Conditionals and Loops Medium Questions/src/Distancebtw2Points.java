import java.util.Scanner;

public class Distancebtw2Points {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float x1 , x2 , y1 , y2 ;

        System.out.println("Enter x-coordinate of first point");
        x1 = inp.nextFloat();
        System.out.println("Enter y-coordinate of first point");
        y1 = inp.nextFloat();

        System.out.println("Enter x-coordinate of second point");
        x2 = inp.nextFloat();
        System.out.println("Enter y-coordinate of second point");
        y2 = inp.nextFloat();

        double distance = Math.sqrt((Math.pow((x2-x1),2)) + (Math.pow((y2-y1),2)));
        System.out.println("The distance is " + distance);

    }
}
