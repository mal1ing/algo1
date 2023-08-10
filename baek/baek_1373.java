package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_1373 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String bi = br.readLine();
        int num = bi.length();

        if(num % 3 == 1){
            System.out.print(bi.charAt(0));
        } else if(num % 3 == 2){
            System.out.print((bi.charAt(0) - '0') * 2 + (bi.charAt(1) - '0'));
        }

        for(int i = num % 3; i < num; i += 3){
            System.out.print((bi.charAt(i) - '0') * 4 + (bi.charAt(i + 1) - '0') * 2 + (bi.charAt(i + 2) - '0'));
        }
    }
}
