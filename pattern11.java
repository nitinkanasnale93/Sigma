public class pattern11 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= 5; i++) {
            for (int x = 5; x > i; x--) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

}
