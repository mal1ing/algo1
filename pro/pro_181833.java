package pro;

public class pro_181833 {
    public static void main(String[] args) {
        int n  = 3;
        int[][] answer = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j){
                    answer[i][j] = 1;
                } else {
                    answer[i][j] = 0;
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }
    }
}
