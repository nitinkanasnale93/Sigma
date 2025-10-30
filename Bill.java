import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the item price: ");
        double price1 = sc.nextDouble();

        System.out.print("Enter the second item price: ");
        double price2 = sc.nextDouble();

        System.out.println("Enter the third item price: ");
        double price3 = sc.nextDouble();

        double price = price1 + price2 + price3;
        double gst = price * 0.07;

        System.out.println("The item price without gst is: " + price);

        System.out.println("With gst is: " + gst);

        sc.close();


    }
}
