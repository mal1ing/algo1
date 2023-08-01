package baek;

import java.util.Scanner;

public class baek_26082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int OpPrice = sc.nextInt();
        int OpPerf = sc.nextInt();
        int Price = sc.nextInt();
        int num;
        num = 3 * Price * (OpPerf / OpPrice);
        System.out.println(num);

    }
}
