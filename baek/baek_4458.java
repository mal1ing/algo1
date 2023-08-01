package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class baek_4458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i < num; i++){
            String str = br.readLine();
            String[] strArr = str.split("");
            strArr[0] = strArr[0].toUpperCase();

            for(int j = 0; j < strArr.length; j++){
                System.out.print(strArr[j]);
            }
            System.out.println();
        }
    }
}
