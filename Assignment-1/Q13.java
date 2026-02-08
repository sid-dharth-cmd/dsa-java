import java.util.Scanner;
public class Q13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the arrays: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];
        System.out.println("Enter "+n+" elements for first array: ");
        for (int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter "+n+" elements for second array: ");
        for (int i = 0; i < b.length; i++){
            b[i] = sc.nextInt();
        }
        System.out.println("Dot product of array a and b: ");
        for (int i = 0; i < c.length; i++){
            System.out.print((c[i] = a[i] * b[i])+" ");
        }
        sc.close();
    }    
}
