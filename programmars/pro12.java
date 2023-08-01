package programmars;

import java.util.Scanner;

public class pro12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        String num1Str = String.valueOf(num1);
        String num2Str = String.valueOf(num2);

        String sumABStr = num1Str + num2Str;
        String sumBAStr = num2Str + num1Str;
        int sumABInt = Integer.parseInt(sumABStr);
        int sumBAInt = Integer.parseInt(sumBAStr);

        if(sumABInt > sumBAInt){
            System.out.println(sumABInt);
        } else if(sumBAInt > sumABInt){
            System.out.println(sumBAInt);
        } else {
            System.out.println(sumABInt);
        }



    }
}
