package doit_algo;

import java.util.Scanner;

public class doit_001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 숫자의 개수
        long num1 = sc.nextInt();

        String num = sc.next();
        String[] numArr = num.split("");

        long sum = 0;
        for(int i = 0; i < num1; i++){
            sum += Integer.parseInt(numArr[i]);
        }

        System.out.println(sum);
    }
}
