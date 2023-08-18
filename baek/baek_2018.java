package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());

        int cnt = 0;

        int pointer = 1;
        int tmp = pointer;
        int sum = 0;
        while (pointer != num1 + 1){
            sum += tmp;
            tmp++;
            if(sum == num1){
                pointer++;
                tmp = pointer;
                sum = 0;
                cnt++;
            } else if(sum > num1){
                pointer++;
                tmp = pointer;
                sum = 0;
            }

        }


        System.out.println(cnt);
    }
}
