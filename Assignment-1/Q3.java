//import java.util.Scanner;
public class Q3 {
    public static void main(String[] args){
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0, product = 1;
        while(temp != 0){
            sum += temp % 10;
            product *= temp % 10;
            n /= 10;
        }
        if (sum == product)
            System.out.println(n+" is a spy number.");
        else 
            System.out.println(n+" is not a spy number.");
        sc.close();
*/

        int n = 1;
        int temp = n;
        int sum = 0, product = 1, count = 0;
        while (true){
            while(temp != 0){
                sum += temp % 10;
                product *= temp % 10;
                temp /= 10;
            }
            if (sum == product){
                System.out.println(n);
                count++;
            }
            if (count == 50)
                break;
            n++;
            temp = n;
            sum = 0;
            product = 1;
        }
    }
}
