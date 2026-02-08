import java.util.Scanner;
public class Q11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        if (a + b == c || a - b == c || a * b == c)
            System.out.println(a+", "+b+" and "+c+" can be used in a correct arithmetic formula.");
        else
            System.out.println(a+", "+b+" and "+c+" cannot be used in a correct arithmetic formula.");
        sc.close();
    }    
}
