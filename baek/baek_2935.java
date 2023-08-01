package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class baek_2935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger num1 = new BigInteger(br.readLine());
        String str1 = br.readLine();
        BigInteger num2 = new BigInteger(br.readLine());
        BigInteger sum = BigInteger.valueOf(0);
        if(str1.equals("+")){
            sum = num1.add(num2);
        } else if(str1.equals("*")){
            sum = num1.multiply(num2);
        }

        System.out.println(sum);

    }
}
