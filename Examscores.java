import java.util.Scanner;
public class Examscores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int val;

        System.out.println("Enter the 25 exam score:");

        for(int i = 1; i <= 25; i++) {
            val = sc.nextInt();
            sum = sum + val;
        }
        
        int average = sum / 25;
        System.out.println("The average score is: " + average);
        sc.close();
    }
    
}
