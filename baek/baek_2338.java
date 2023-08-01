package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class baek_2338 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger num1 = new BigInteger(br.readLine());
        BigInteger num2 = new BigInteger(br.readLine());

        BigInteger res1 = num1.add(num2);
        BigInteger res2 = num1.subtract(num2);
        BigInteger res3 = num1.multiply(num2);

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}
