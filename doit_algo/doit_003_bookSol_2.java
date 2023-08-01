package doit_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class doit_003_bookSol_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        long[] sum1Arr = new long[num1 + 1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= num1; i++){
            sum1Arr[i] = sum1Arr[i - 1] + Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < num2; i++){
            st = new StringTokenizer(br.readLine());
            int res1 = Integer.parseInt(st.nextToken());
            int res2 = Integer.parseInt(st.nextToken());
            System.out.println(sum1Arr[res2] - sum1Arr[res1 - 1]);
        }
    }
}
