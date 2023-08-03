package baek;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baek_16212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        int[] num1Arr = new int[num1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < num1; i++){
            num1Arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num1Arr);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int num : num1Arr){
            bw.write(num + " ");
        }

        bw.close();
    }
}
