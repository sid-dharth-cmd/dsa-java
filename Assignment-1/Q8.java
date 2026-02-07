import java.util.Scanner;
public class Q8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Row and Columns of 2D-Array: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int A[][] = new int[row][col];
        System.out.print("Enter elements of 2D-Array: ");
        for(int i = 0; i < A.length; i++){
            for (int j = 0; j < A[0].length; j++){
                A[i][j] = sc.nextInt();
            }
        }
        int sum = 0 ;
        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A[0].length; j++){
                System.out.print(A[i][j]+" ");
                sum += A[i][j];
            }
            System.out.println();
        }
        System.out.println("The sum of elements of the 2D-Array is "+sum);
        sc.close();
    }
}
