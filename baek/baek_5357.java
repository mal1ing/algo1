package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_5357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());


        for(int i = 0; i < num1; i++){
            String str = br.readLine();
            String[] strArr = str.split("");
            String rst = strArr[0];
            String tmp = strArr[0];
            int cnt = 1;
            while (cnt != strArr.length){
                if(tmp.equals(strArr[cnt])){
                    cnt++;
                } else {
                    rst += strArr[cnt];
                    tmp = strArr[cnt];
                    cnt++;
                }

            }


            System.out.println(rst);
        }
    }
}
