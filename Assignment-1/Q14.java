import java.util.Scanner;
public class Q14 {
    public static double[][] addMatrix(double[][] a, double[][] b){
        double c[][] = new double[a.length][a[0].length];
        for (int i = 0; i < c.length; i++){
            for (int j = 0; j < c[i].length; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dimensions of the two matrics: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        double A[][] = new double[row][col];
        double B[][] = new double[row][col];
        System.out.println("Enter elements for the first matrix: ");
        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A[i].length; j++){
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements for the second matrix: ");
        for (int i = 0; i < B.length; i++){
            for (int j = 0; j < B[i].length; j++){
                B[i][j] = sc.nextInt();
            }
        }
        double C[][] = addMatrix(A,B);
        for (int i = 0; i < C.length; i++){
            for (int j = 0; j < C[i].length; j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
