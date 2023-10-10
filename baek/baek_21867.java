package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_21867 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());

        String str = "";

        String str1 = br.readLine();
        str1 = str1.replaceAll("J|A|V", "");
        int num = str1.length();

        if(num == 0){
            System.out.println("nojava");
        } else {
            System.out.println(str1);
        }

    }
}
