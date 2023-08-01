package doit_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class doit_003_mySOl_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int[] num1Arr = new int[num1];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < num1Arr.length; i++){
            num1Arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] sumArr = new int[num1 + 1];
        for(int i = 1; i <= num1; i++){
            sumArr[i] = sumArr[i - 1] + num1Arr[i - 1];
        }


        for(int i = 0; i < num2; i++){
            st = new StringTokenizer(br.readLine());
            int res1 = Integer.parseInt(st.nextToken());
            int res2 = Integer.parseInt(st.nextToken());
            System.out.println(sumArr[res2] - sumArr[res1 - 1]);
        }


    }
}
