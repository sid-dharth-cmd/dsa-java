import java.util.Scanner;
public class Q6 {
    public static boolean isOdd(int n){
        if (n < 0)
            n = -n;
        while (n > 1){
            n -= 2;
        }
        return n == 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(n+" is odd: "+isOdd(n));
        sc.close();
    }
}
