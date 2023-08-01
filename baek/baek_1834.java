package baek;

import java.util.Scanner;

public class baek_1834 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long num1 = scan.nextLong();
        long num2 = 0;
        for(int i = 1; i < num1; i++){
            num2 += (num1 + 1) * i;
            }
        System.out.println(num2);
    }
}
