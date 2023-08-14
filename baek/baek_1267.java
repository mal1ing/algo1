package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_1267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());

        long youngPay = 0;
        long minPay = 0;


        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < num1; i++){
            int time = Integer.parseInt(st.nextToken());
            youngPay += ((time / 30 ) + 1)  * 10;
            minPay += ((time / 60) + 1) * 15;
        }

        if(minPay == youngPay) {
            System.out.println("Y M " + minPay);
        } else if(minPay < youngPay){
            System.out.println("M " + minPay);
        } else if(minPay > youngPay){
            System.out.println("Y " + youngPay);
        }

    }
}
