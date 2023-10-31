package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_15719 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        int[] numArr = new int[num1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < num1; i++){
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        int tmp = 0;
        while (cnt != numArr.length){
            if(numArr[cnt] == numArr[cnt++]){
                tmp = numArr[cnt];
                break;
            } else{
                cnt++;
            }
        }

        System.out.println(tmp);

    }
}
