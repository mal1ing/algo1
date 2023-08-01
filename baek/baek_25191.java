package baek;

import java.util.Scanner;

public class baek_25191 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        int num4 = 0;
        int coke = num2 / 2;
        int cobe = coke + num3;


        for(int i = 0; i < num1; i++){
            if(cobe > 0){
                num4++;
                cobe--;
            }
        }
        System.out.println(num4);
    }
}
