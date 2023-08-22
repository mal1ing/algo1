package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        String str = "";
        for(int i = num1; i <= num2; i++){
            int sum = 0;
            if(i == 1){
                sum += i;
            } else {
                for(int j = 2; j <= i; j++){
                    if(i % j == 0){
                        sum += j;
                    }
                }
            }

            if(sum == i){
                str += String.valueOf(sum) + " ";
            }
        }
        String[] strArr = str.split(" ");
        for(int i = 0; i < strArr.length; i++){
            System.out.println(strArr[i]);
        }
    }


}
