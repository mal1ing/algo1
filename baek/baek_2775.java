package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] apt = new int[15][15];
        for(int i = 0; i < 15; i++){
            apt[i][1] = 1;
            apt[0][i] = i;
        }

        for(int i = 1; i < 15; i++){    //1층 부터 14층까지
            for(int j = 2; j <15; j++){ // 2호부터 14호까지
                apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
            }
        }


        int num1 = Integer.parseInt(br.readLine());

        for(int i = 0; i < num1; i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            System.out.println(apt[k][n]);
        }

    }
}
