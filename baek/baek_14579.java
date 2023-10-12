package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_14579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        long tmp = 0;
        long tmp2 = 1;
        for(int i = num1; i <= num2; i++){
            for(int j = 1; j <= i; j++){
                tmp += j;
            }
            tmp2 *= tmp;
            tmp = 0;
        }

        long rst = 0;
        rst = tmp2  % 14579;
        System.out.println(rst);
    }
}
