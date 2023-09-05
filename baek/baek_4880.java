package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_4880 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int num3 = Integer.parseInt(st.nextToken());

            if(num1 == 0 && num2 == 0 && num3 == 0){
                break;
            }

            if(num2 - num1 == num3 - num2){
                System.out.println("AP " + (num3 + (num2 - num1)));
            } else if(num2 / num1 == num3 / num2){
                System.out.println("GP " + (num3 * (num2 / num1)));
            }
        }
    }
}
