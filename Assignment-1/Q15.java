public class Q15 {
    public static void main(String[] args){
        int A[][] = new int[4][4];
        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A[i].length; j++){
                A[i][j] = (int)(Math.random()*(1-0+1))+0;
            }
        }
        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A[i].length; j++){
                System.out.print(A[i][j]+" ");

            }
            System.out.println();
        }
        int row = 0, col = 0, row_max = 0, col_max = 0;
        for (int i = 0; i < A.length; i++){
            int row_cnt = 0, col_cnt = 0;
            for (int j = 0; j < A[i].length; j++){
                if (A[i][j] == 1)
                    row_cnt++;
                if (A[j][i] == 1)
                    col_cnt++;
            }
            if (row_cnt > row_max){
                row_max = row_cnt;
                row = i;
            }
            if (col_cnt > col_max){
                col_max = col_cnt;
                col = i;
            }
        }
        System.out.println("The largest row index: "+row);
        System.out.println("The largest column index: "+col);
    }
}
