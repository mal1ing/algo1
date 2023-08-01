package baek;

import java.util.Arrays;
import java.util.Scanner;

public class baek_4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numArr = new int[3];
        for(int i = 0; ; i++){
            numArr[0] = sc.nextInt();
            numArr[1] = sc.nextInt();
            numArr[2] = sc.nextInt();

            if(numArr[0] == 0 && numArr[1] == 0 && numArr[2] == 0){
                break;
            }

            Arrays.sort(numArr);
            if(Math.pow(numArr[0], 2) + Math.pow(numArr[1],2) == Math.pow(numArr[2],2)){
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
