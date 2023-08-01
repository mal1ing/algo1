package chap1.test;

import java.util.Scanner;

public class test16 {
    static void npira(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (i - 1) * 2 + 1; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("피라미드를 몇층까지 쌓을까요? :");
        int n = scan.nextInt();
        npira(n);
    }
}
