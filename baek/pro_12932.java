package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pro_12932 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        long num = Long.parseLong(br.readLine());
        long num = 12345;
        String str = "";
        while(num >= 1){
//            System.out.println(str);
//            System.out.println(num);
            str += String.valueOf(num % 10);
            num /= 10;
        }

        System.out.println(str);

    }
}
