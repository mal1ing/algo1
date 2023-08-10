package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_14916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());

        int cnt = 0;

        while (num1 > 0){
            // 5 나뉘는 경우
            if(num1 % 5 == 0){
                cnt = num1 / 5 + cnt;
                break;
            }

            num1 = num1 - 2;
            cnt++;
        }

        if(num1 < 0){
            System.out.println(-1);
        } else {
            System.out.println(cnt);
        }
    }
}
