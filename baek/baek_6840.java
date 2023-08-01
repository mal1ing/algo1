package baek;

import java.util.Arrays;
import java.util.Scanner;

public class baek_6840 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numArr = new int[3];
        for(int i = 0; i < numArr.length; i++){
            numArr[i] = sc.nextInt();
        }

        Arrays.sort(numArr);

        System.out.println(numArr[1]);
    }
}
