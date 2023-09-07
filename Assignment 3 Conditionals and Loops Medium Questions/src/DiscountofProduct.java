import java.util.Scanner;

public class DiscountofProduct {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("enter discount percentage");
        float discount = x.nextFloat();
        System.out.println("enter price of product");
        float price = x.nextFloat();

        float final_price = price - ((discount/100) * price);

        System.out.println("Final price after discount " + final_price);

    }
}
