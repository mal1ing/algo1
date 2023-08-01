package baek;

import java.util.Scanner;

public class baek_26209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num1 = new int[8];
        int sum = 0;
        for(int i = 0; i < num1.length; i++) {
            num1[i] = sc.nextInt();
            if(num1[i] > 2){
                sum++;
            }
        }

        if(sum > 0){
            System.out.println("F");
        } else {
            System.out.println("S");
        }
    }
}
