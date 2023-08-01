package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baek_1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int[] numArr = new int[num];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < num; i++){
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numArr);

        System.out.println(numArr[0] * numArr[numArr.length - 1]);
    }
}
