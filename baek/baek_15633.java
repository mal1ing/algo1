package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_15633 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i = 1; i <= num1; i++){
            if(num1 % i == 0){
                sum += i;
            }
        }

        System.out.println(sum * 5 - 24);


    }
}
