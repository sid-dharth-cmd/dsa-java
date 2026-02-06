import java.util.Scanner;
public class Q5 {
    public static int sum_Of_Digits(int n){
        int sum = 0;
        while (true){
            while(n != 0){
                sum += n %10;
                n /= 10;
            }
            if (sum > 9){
                n = sum;
                sum = 0;
            }
            else
                break;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Sum of digits of 9294 until the number is a single digit is "+sum_Of_Digits(n));
        sc.close();
    }
}
