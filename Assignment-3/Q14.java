import java.util.Scanner;
public class Q14 {
    public static int product(int m, int n){
        if (n == 0)
            return 0;
        else 
            return (m + product(m, n-1));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers to multiply: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Product: "+product(m, n));
        sc.close();
    }
}
