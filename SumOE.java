import java.util.Scanner;

public class SumOE {
    public static void main(String[] args) {
        int Even = 0;
        int Odd = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                Even += num;
            } else {
                Odd += num;
            }
        }

        System.out.println("Sum of Even Numbers: " + Even);
        System.out.println("Sum of Odd Numbers: " + Odd);

        sc.close();
    }
}
