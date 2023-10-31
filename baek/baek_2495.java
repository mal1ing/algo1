package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_2495 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 3; i++){
            String num = br.readLine();
            String[] numArr = num.split("");
            int cnt = 1;
            int cnt2 = 1;

            int tmp = 0;
            int tmp2 = 1;
            while (tmp2 != numArr.length){
                if(numArr[tmp].equals(numArr[tmp2])){
                    cnt++;
                    tmp++;
                    tmp2++;
                } else {
                    if(cnt > cnt2){
                        cnt2 = cnt;
                    }
                    cnt = 1;
                    tmp++;
                    tmp2++;
                }
            }

            if(cnt > cnt2){
                System.out.println(cnt);
            } else {
                System.out.println(cnt2);
            }
        }
    }
}
