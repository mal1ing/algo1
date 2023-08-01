package baek;

import java.math.BigInteger;
import java.util.Scanner;

public class baek_24082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger num1 = new BigInteger(sc.next());

        BigInteger num2 = num1.multiply(num1);
        BigInteger num3 = num2.multiply(num1);

        System.out.println(num3);
    }
}
