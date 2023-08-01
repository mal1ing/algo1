package baek;

import java.util.Scanner;

public class baek_7891 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num1 = sc.nextInt();
        for(int i = 0; i < num1; i++){
            long num2 = sc.nextInt();
            long num3 = sc.nextInt();
            long res = num2 + num3;
            System.out.println(res);
        }
    }
}
