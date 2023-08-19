package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_11966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double num1 = Long.parseLong(br.readLine());
        double cnt = 0;
        double num = 0;

        while (num1 >= 2){
            num = num1 / 2.0;
            cnt = num1 % 2;
            num1 = num;
        }

        if(cnt == 0){
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
