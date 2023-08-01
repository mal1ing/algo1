package chap1.test;

import java.util.Scanner;

public class test15 {
    static void spira(int n ) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= (i - 1) * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("점이 몇개인지 선택하세요 :");
        int n = scan.nextInt();
        spira(n);
    }
}
