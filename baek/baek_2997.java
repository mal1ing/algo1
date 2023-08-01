package baek;

import java.util.Arrays;
import java.util.Scanner;

public class baek_2997 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numArr = new int[3];

        for(int i = 0; i < numArr.length; i++){
                numArr[i] = sc.nextInt();
        }

        Arrays.sort(numArr);

        int num = numArr[1] - numArr[0];
        int num2 = numArr[2] - numArr[1];

        if(num == num2){
            System.out.println(numArr[2] + num);
        } else if(num < num2){
            System.out.println(numArr[1] + num);
        } else {
            System.out.println(numArr[0] + num2);
        }


    }
}
