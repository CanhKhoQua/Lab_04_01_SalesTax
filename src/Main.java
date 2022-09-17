import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        double taxPrice=0;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the price of an item");

        double price = myObj.nextDouble();
        taxPrice = price * 5/100;
        System.out.println("Sales tax is: " + taxPrice);

    }
}
