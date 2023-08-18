package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());




        //최대한 적은 봉지 == 5 키로를 기본으로
        // 18 - 5 13 - 5 8 - 5 3 - 5 + 5 - 3 == 0
        // 4 - 5 + 5 -3 1 -5 + 5 -3 + 3 1 == -1
        // 6 - 5 + 5 - 3 3 - 5 + 5 - 3  == 0
        // 9 - 5  4 - 5 + 5 4 - 3  1


        if(num1 == 4 || num1 == 7){
            System.out.println(-1);
        } else if(num1 % 5 == 0){
            System.out.println(num1 / 5);
        } else if(num1 % 5 == 1 || num1 % 5 == 3){
            System.out.println((num1 / 5) + 1);
        } else if(num1 % 5 == 2 || num1 % 5 == 4){
            System.out.println((num1 / 5) + 2);
        }

    }
}
