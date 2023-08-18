package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_10804 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numArr = new int[20];

        for(int i = 1; i <= 20; i++){
            numArr[i - 1] = i;
        }

        for(int i = 0; i < 10; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 5 10
            int num1 = Integer.parseInt(st.nextToken()) - 1;
            int num2 = Integer.parseInt(st.nextToken()) - 1;

            int mid = (num2 - num1) / 2;

            for(int j = 0; j <= mid; j++){
                int tmp = numArr[num1 + j];
                numArr[num1 + j] = numArr[num2 - j];
                numArr[num2 - j] = tmp;
            }
        }
        for(int n : numArr){
            System.out.print(n + " ");
        }
    }
}
