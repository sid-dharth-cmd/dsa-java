import java.util.Scanner;
public class Q11 {
    public static int gcd(int m, int n){
        if (n == 0)
            return m;
        else
            return gcd(n, m % n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("GCD("+m+", "+n+"): "+gcd(m, n));
        sc.close();
    }
}
