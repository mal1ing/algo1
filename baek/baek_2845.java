package baek;

import java.util.Scanner;

public class baek_2845 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int res1 = num1 * num2;

        for(int i = 0; i < 5; i++){
            int answer = sc.nextInt();
            System.out.print(answer - res1 + " ");
        }
    }
}
