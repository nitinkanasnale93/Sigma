import java.util.Scanner;
public class Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number:");
        int num2 = sc.nextInt();
        if(num1 > num2) {
            System.out.println("Num 1 is largest");
        }
        else{
            System.out.println("Num2 is largest");
        }
        sc.close();
    }
    
}
