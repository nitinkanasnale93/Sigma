import java.util.Scanner;
public class posneg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        if(number > 0) {
            System.out.println("The number is positive");
        }
        else if(number < 0) {
            System.out.println("the number is nagative");
        }
        else {
            System.out.println("the number is zero");
        }
        sc.close();
    }
}