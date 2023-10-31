package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_18406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String[] str1Arr = str1.split("");

        int num1 = 0;

        for(int i = 0; i < str1Arr.length / 2; i++){
            num1 += Integer.parseInt(str1Arr[i]);
        }

        int num2 = 0;
        for(int i = str1Arr.length / 2; i < str1Arr.length; i++){
            num2 += Integer.parseInt(str1Arr[i]);
        }

        if(num1 == num2){
            System.out.println("LUCKY");
        } else {
            System.out.println("READY");
        }

    }
}
