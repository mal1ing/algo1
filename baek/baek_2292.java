package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        int count = 1;
        int range = 2;


        if(num1 == 1){
            System.out.println(1);
        } else {
            while (range <= num1){
                range = range + ( 6 * count);
                count++;
            }
            System.out.println(count);
        }



        // 1 1 1
        // 2 ~ 7 2 6
        // 8 ~ 19 3 12
        // 20 ~ 37 4 18

    }
}
