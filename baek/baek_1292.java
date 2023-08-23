package baek;

import java.io.*;
import java.util.StringTokenizer;

public class baek_1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int cnt = 0;
        int result = 0;

        for(int i = 1; i <= num2; i++){
            for(int j = 1; j <= i; j++){
                cnt++;

                if(num1 <= cnt && cnt <= num2){
                    result += i;
                }
            }
        }

        System.out.println(result);
    }
}
