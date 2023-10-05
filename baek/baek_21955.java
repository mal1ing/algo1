package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_21955 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num1 = br.readLine();
        String[] strArr = num1.split("");

        String str1 = "";
        String str2 = "";

        int len = strArr.length / 2;
        for(int i = 0; i < len; i++){
            str1 += strArr[i];
        }

        for(int i = len; i < strArr.length; i++){
            str2 += strArr[i];
        }


        System.out.println(str1 + " " + str2);

    }
}
