package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_5586 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] strArr = str.split("");
        int joi = 0;
        int ioi = 0;

        int cnt = 0;
        String tmp = "";
        for(int i = 0; i < strArr.length; i++){
            tmp += strArr[i];
            cnt++;
            if(cnt == 3){
                if(tmp.equals("IOI")){
                    ioi++;
                } else if(tmp.equals("JOI")){
                    joi++;
                }
                tmp = "";
                cnt = 0;
                i = i - 2;
            }
        }

        System.out.println(joi);
        System.out.println(ioi);
    }
}
