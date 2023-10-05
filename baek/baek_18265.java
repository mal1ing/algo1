package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_18265 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());

        int cnt = 0;
        int rst = 0;
        for(int i = 1; ; i++){
            if(i % 3 == 0 || i % 5 == 0){
                continue;
            } else {
                cnt++;
                rst = i;
            }

            if(cnt == num1){
                break;
            }
        }

        System.out.println(rst);

    }
}
