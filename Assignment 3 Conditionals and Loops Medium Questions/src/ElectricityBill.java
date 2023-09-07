import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Enter cost per unit");
        float rate_per_unit = x.nextFloat();

        System.out.println("Enter Total Units Consumed");
        float units_consumed = x.nextFloat();

        double bill = rate_per_unit * units_consumed;
        System.out.println("Your Bill is $" + bill);


    }
}
