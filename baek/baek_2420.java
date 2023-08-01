package baek;

import java.util.Scanner;

public class baek_2420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num1 = sc.nextInt();
        long num2 = sc.nextInt();
        long sum = num1 - num2;
        if(sum < 0){
            sum = -sum;
        }

        System.out.println(sum);
    }
}
