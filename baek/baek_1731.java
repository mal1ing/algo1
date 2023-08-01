package baek;

import java.util.Scanner;

public class baek_1731 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        long[] numArr = new long[num1];
        for(int i = 0; i < num1; i++) {
            int num2 = scan.nextInt();
            numArr[i] += num2;
        }



        for(int i = 0; i < numArr.length; i++){
            if(numArr[1] - numArr[0] == numArr[2] - numArr[1]){
                System.out.println(numArr[numArr.length - 1 ] + (numArr[2] - numArr[1]));
                break;
            } else if(numArr[1] / numArr[0] == numArr[2] / numArr[1]){
                System.out.println(numArr[numArr.length - 1] * (numArr[2] / numArr[1]));
                break;
            }
        }
    }
}
