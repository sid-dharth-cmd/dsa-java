import java.util.Scanner;
public class Q8 {
    public static int pow(int x, int n){
        if (n == 0)
            return 1;
        else
            return (x * pow(x, n-1));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real number(x) and positive integer(n): ");
        int x = sc.nextInt();
        int n = sc.nextInt();
        if (x == 0)
            System.out.println(x+" to the power "+n+" is 0.");
        else
            System.out.println(x+" to the power "+n+" is "+pow(x, n));
        sc.close();
    }
}
