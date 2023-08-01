package baek;

import java.util.Arrays;
import java.util.Scanner;

public class baek_2822 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numArr = new int[8];
        for(int i = 0; i < 8; i++){
            numArr[i] = scan.nextInt();
        }

        Arrays.sort(numArr);
        for(int num: numArr){
            System.out.println(num);
        }
    }
}
