package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int money = Integer.parseInt(br.readLine());
        int num1 = 1000 - money;
        int coin = 0;

        while(num1 != 0){
            if(num1 >= 500){
                num1 = num1 - 500;
                coin++;
            } else if(num1 >= 100){
                num1 = num1 - 100;
                coin++;
            } else if(num1 >= 50){
                num1 = num1 - 50;
                coin++;
            } else if(num1 >= 10){
                num1 = num1 - 10;
                coin++;
            } else if(num1 >= 5){
                num1 = num1 - 5;
                coin++;
            } else if(num1 >= 1){
                num1 = num1 - 1;
                coin++;
            }
        }

        System.out.println(coin);
    }
}
