package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baek_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());

        int[][] numArr = new int[num1][2];

        for(int i = 0; i < num1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            numArr[i][0] = Integer.parseInt(st.nextToken());
            numArr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numArr, (e1, e2) ->{
            if(e1[0] == e2[0]) {
                return e1[1] - e2[1];
            } else {
                return e1[0] - e2[0];
            }
        });

        for(int i = 0; i < num1; i++){
            System.out.println(numArr[i][0] + " " + numArr[i][1]);
        }

    }
}
