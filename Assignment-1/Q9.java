import java.util.Scanner;
public class Q9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double A[][] = new double[4][4];
        System.out.println("Enter a 4-by-4 matrix row by row:");
        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A[0].length; j++){
                A[i][j] = sc.nextDouble();
            }
        }
        double sum = 0;
        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A[0].length; j++){
                if (i == j)
                    sum += A[i][j];
            }
        }
        System.out.println("Sum of the elements in the major diagonal is "+sum);
        sc.close();
    }
}
