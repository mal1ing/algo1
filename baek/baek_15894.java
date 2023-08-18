package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_15894 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());

        int sum = 0;
        for(int i = 1; i <= num1; i++){
            sum += i;
        }
        System.out.println(sum);
        int var = sum * 4;
        System.out.println(var );

        // 1 0
        // 3 3
        // 6 9
        // 10 18

    }
}
