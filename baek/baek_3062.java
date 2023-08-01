package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_3062 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < num1; i++){
            int sum = 0;
            String str = br.readLine();
            int num = Integer.parseInt(str);
            String[] strArr = str.split("");
            int num_rev = 0;
            String str_rev = "";
            for(int j = strArr.length - 1; j >= 0; j--){
                str_rev += strArr[j];
            }

            num_rev = Integer.parseInt(str_rev);

            sum = num + num_rev;

            String sumStr = String.valueOf(sum);
            String[] sumStrArr = sumStr.split("");

            int tmp = 0;
            for(int j = 0; j < sumStrArr.length / 2; j++){
                if(sumStrArr[j].equals(sumStrArr[sumStrArr.length - 1 - j])){
                    tmp++;
                }
            }

            if(tmp == (sumStrArr.length / 2)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
