public class pattern8 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = n; i >= 1; i--) {
            // print spaces
            for (int space = 1; space < i; space++) {
                System.out.print(" ");
            }

            // print numbers from n down to i
            for (int num = n; num >= i; num--) {
                System.out.print(num);
            }

            // move to next line
            System.out.println();
        }
    }
}
