public class pattern7 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {

            // print spaces
            for (int x = n; x > i; x--) {
                System.out.print("  "); // two spaces for alignment
            }

            // print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println(); // move to next line
        }
    }
}
