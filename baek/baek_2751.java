package baek;

import java.io.*;
import java.util.Arrays;

public class baek_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());

        int[] num1Arr = new int[num1];

        for(int i = 0; i < num1; i++){
            num1Arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(num1Arr);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < num1; i++){
            String s = String.valueOf(num1Arr[i]);
            bw.write(s + "\n");
        }
        bw.close();
    }
}
