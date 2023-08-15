package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_2851 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numArr = new int[10];


        for(int i = 0; i < 10; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        int tmp = 0;
        int tmp2 = 0;
        for(int i = 0; i < numArr.length; i++){
            tmp += numArr[i];

            if(tmp >= 100){
                tmp2 = tmp - numArr[i];
                break;
            }
        }

        if(tmp == 100){
            System.out.println(tmp);
        } else {
            if(100 - tmp2 < tmp - 100){
                System.out.println(tmp2);
            } else if(100 - tmp2 > tmp - 100){
                System.out.println(tmp);
            } else if(100 - tmp2 == tmp - 100){
                System.out.println(tmp);
            }
        }

    }
}
