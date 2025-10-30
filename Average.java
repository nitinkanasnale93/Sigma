import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number[A]: ");
        double A = sc.nextDouble();
        System.out.print("Enter second number[B]: ");
        double B = sc.nextDouble();
        System.out.print("Enter third number[C]: ");
        double C = sc.nextDouble();
        double average = (A + B + C) / 3;
        System.out.println("The average of A, B and C is: " + average);
        sc.close();
    }
}

