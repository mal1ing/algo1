package baek;

import java.util.Scanner;

public class baek_11006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        for(int i = 0; i < num1; i++){
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();

            System.out.println((num3 * 2 - num2) + " " + (num3 - (num3 * 2 - num2)));
        }
    }
}
