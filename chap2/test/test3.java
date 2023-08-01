package chap2.test;

import java.util.Scanner;

public class test3 {
    static int sumOf(int[] a) {
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("요소수: ");
        int num = scan.nextInt();
        int[] x = new int[num];

        for(int i = 0; i < num; i++) {
            System.out.print("x[i" + i + "]: " );
            x[i] = scan.nextInt();
        }

        System.out.println(test3.sumOf(x));
    }
}
