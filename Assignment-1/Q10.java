import java.util.Scanner;
public class Q10 {
    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;
        for (int i = 0; i < m.length; i++){
            sum += m[i][columnIndex];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double A[][] = new double[3][4];
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A[i].length; j++){
                A[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Sum of the elements at column 0 is "+sumColumn(A, 0));
        System.out.println("Sum of the elements at column 1 is "+sumColumn(A, 1));
        System.out.println("Sum of the elements at column 2 is "+sumColumn(A, 2));
        System.out.println("Sum of the elements at column 3 is "+sumColumn(A, 3));
        sc.close();
    }    
}
