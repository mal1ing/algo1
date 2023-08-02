package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_5555 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String res = br.readLine();
        int num1 = Integer.parseInt(br.readLine());

        int cnt = 0;
        for(int i = 0; i < num1; i++){
            String str = br.readLine();
            str += str;

            if(str.contains(res)){
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
