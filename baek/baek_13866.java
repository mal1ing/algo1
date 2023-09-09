package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_13866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] numArr = new int[4];

        for(int i = 0; i < 4; i++){
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        //1234 // 01 23 // 02 13 // 03 12 //
        int num01 = numArr[0] + numArr[1];
        int num23 = numArr[2] + numArr[3];
        int num02 = numArr[0] + numArr[2];
        int num13 = numArr[1] + numArr[3];
        int num03 = numArr[0] + numArr[3];
        int num12 = numArr[1] + numArr[2];
        int tmp1 = num01 - num23;
        int tmp2 = num02 - num13;
        int tmp3 = num03 - num12;
        int[] tmpArr = new int[3];
        tmpArr[0] = tmp1;
        tmpArr[1] = tmp2;
        tmpArr[2] = tmp3;

        int sum = 10000000;
        for(int i = 0; i < tmpArr.length; i++){
            int abs = Math.abs(tmpArr[i]);
            if(sum > abs){
                sum = abs;
            }
        }


        System.out.println(sum);

    }
}
