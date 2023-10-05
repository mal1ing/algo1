package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_18409 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());

        String[] alp = {"a", "e", "i", "o", "u"};
        String str = br.readLine();
        String[] strArr = str.split("");

        int num2 = 0;
        for(int i = 0; i < num1; i++ ){
            for(int j = 0; j < alp.length; j++){
                if(strArr[i].equals(alp[j])){
                    num2++;
                }
            }
        }

        System.out.println(num2);

    }
}
