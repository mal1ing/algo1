package baek;

import java.util.Scanner;

public class baek_10807 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int[] numArr = new int[num1];
        for(int i = 0; i < num1; i++){
            numArr[i] = scan.nextInt();
        }

        int num2 = scan.nextInt();
        int sum = 0;
        for(int i = 0; i < numArr.length; i++){
            if(num2 == numArr[i]){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
