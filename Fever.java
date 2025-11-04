import java.util.Scanner;

public class Fever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a temperature:");
        int number = sc.nextInt();

        if (number > 100) {
            System.out.println("He is having fever");
        } else {
            System.out.println("He is not having fever");
        }

        sc.close();
    }
}
