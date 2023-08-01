package baek;

import java.util.Scanner;

public class baek_3034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int res = (int) (Math.pow(num2,2) + Math.pow(num3, 2));
        for(int i = 0; i < num1; i++){
            if(res >= Math.pow(sc.nextInt(), 2)){
                System.out.println("DA");
            } else{
                System.out.println("NE");
            }
        }
    }
}
