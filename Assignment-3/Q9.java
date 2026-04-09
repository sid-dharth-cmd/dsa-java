import java.util.Scanner;
public class Q9 {
    public static void rev(int n){
        if (n == 0)
            return;
        System.out.print(n%10);
        rev(n/10);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int n = sc.nextInt();
        rev(n);
        sc.close();
    }
}
