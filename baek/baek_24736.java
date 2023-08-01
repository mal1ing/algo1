package baek;

import java.util.Scanner;


public class baek_24736 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int sum2 = 0;
        int[] numArr = new int[5];
        int[] numArr2 = new int[5];

        for(int i = 0; i < numArr.length; i++) {
            numArr[i] = sc.nextInt();
        }
        for(int i = 0; i < numArr.length; i++) {
            numArr2[i] = sc.nextInt();
        }

        sum = numArr[0] * 6 + numArr[1] * 3 + numArr[2] * 2 + numArr[3] + numArr[4] * 2;
        sum2 = numArr2[0] * 6 + numArr2[1] * 3 + numArr2[2] * 2 + numArr2[3] + numArr2[4] * 2;

        System.out.println(sum + " " + sum2);

    }
}
