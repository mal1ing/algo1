package baek;

import java.util.Scanner;

public class baek_1934 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        for(int i = 0; i < num1; i++){
            String[] numArr = new String[2];
            numArr[0] = sc.next();
            numArr[1] = sc.next();
            System.out.println(Integer.parseInt(numArr[0]) * Integer.parseInt(numArr[1]) / gdc(Integer.parseInt(numArr[0]), Integer.parseInt(numArr[1])));

        }
    }

    private static int gdc(int num1, int num2){
        if(num2 == 0){
            return num1;
        }

        return gdc(num2, num1 % num2);
    }
}
