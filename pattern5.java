import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {            // Outer loop for rows
            for (int col = 1; col <= n; col++) {        // Inner loop for columns

                // Border condition: top row, bottom row, left column, right column
                if (row == 1 || row == n || col == 1 || col == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Two spaces for inner hollow part
                }
            }
            System.out.println(); // Move to next line after each row
        }

        sc.close();
    }
}
