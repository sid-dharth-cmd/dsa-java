import java.util.Scanner;
public class Q7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements of Array: ");
        int n = sc.nextInt();
        int A[] = new int[n];
        System.out.print("Enter elements of the array: ");
        for (int i = 0; i < A.length; i++){
            A[i] = sc.nextInt();
        }
        int max = A[0], min = A[0];
        for (int i = 0; i < A.length; i++){
            if (max < A[i])
                max = A[i];
            if (min > A[i])
                min = A[i];
        }
        int first_occ_max = 0, max_cnt = 0;
        int last_occ_min = 0, min_cnt = 0;
        for (int i = A.length - 1; i > 0; i--){
            if (max == A[i]){
                first_occ_max = i+1;
                max_cnt++;
            }
            if (min == A[A.length - (i + 1)]){
                last_occ_min = (A.length - (i + 1))+1;
                min_cnt++;
            }
        }
        System.out.println("Maximum elements of Array is "+max+" and occurs "+max_cnt+" times.");
        System.out.println("Minimum elements of Array is "+min+" and occurs "+min_cnt+" times.");
        System.out.println("First occurrence of maximum element is at position "+first_occ_max+".");
        System.out.println("Last occurrence of minimum element is at position "+last_occ_min+".");
        sc.close();
        sc.close();
    }    
}
