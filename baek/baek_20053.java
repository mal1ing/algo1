package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baek_20053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        for(int i = 0; i < num1; i++){
            int num2 = Integer.parseInt(br.readLine());
            int[] num2Arr = new int[num2];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < num2; j++){
                num2Arr[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(num2Arr);
            System.out.println(num2Arr[0] + " " + num2Arr[num2Arr.length - 1]);
        }

    }
}
