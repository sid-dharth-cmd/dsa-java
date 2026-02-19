import java.util.Scanner;
public class Q5 {
    public static int sum_Of_Digits(int n){
        int sum = 0;
        while (sum > 9 || n > 0){
            if (n == 0){
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Sum of digits of "+n+" until the number is a single digit is "+sum_Of_Digits(n));
        sc.close();
    }
}
