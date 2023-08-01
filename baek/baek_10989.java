package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baek_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int length = Integer.parseInt(br.readLine());
        int[] numArr = new int[length];

        for(int i = 0; i < numArr.length; i++){
            numArr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numArr);

        for(int i = 0; i< numArr.length; i++){
            sb.append(numArr[i]).append('\n');
        }

        System.out.println(sb);
    }
}
