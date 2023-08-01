package baek;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class baek_19757 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        BigInteger num1 = new BigInteger(sc.next());
        BigInteger num2 = new BigInteger(sc.next());

        BigInteger num3 = num1.add(num2);

        System.out.println(num3);

    }
}
