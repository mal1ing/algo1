package baek;

import java.util.Scanner;

public class baek_4504 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        for(int i = 0; ; i++){
            int num2 = sc.nextInt();
            if(num2 == 0){
                break;
            }
            if(num2 % num1 == 0){
                System.out.println(num2 + " is a multiple of " + num1 + ".");
            } else {
                System.out.println(num2 + " is NOT a multiple of " + num1 + ".");
            }
        }
    }
}
