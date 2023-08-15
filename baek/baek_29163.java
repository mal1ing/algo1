package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_29163 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());

        int even = 0;
        int odd = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < num1; i++){
            int num = Integer.parseInt(st.nextToken());
            if(num % 2 == 0){
                even++;
            } else {
                odd++;
            }
        }

        if(even > odd){
            System.out.println("Happy");
        } else {
            System.out.println("Sad");
        }
    }
}
