package baek;

import java.util.Scanner;

public class baek_17608 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int[] numArr = new int[num1];

        for(int i = 0; i < num1; i++){
            numArr[i] = sc.nextInt();
        }

        int max = 0;
        int tmp =0;
        for(int i = num1 - 1; i >= 0; i--){
            if(numArr[i] > max){
                max = numArr[i];
                tmp++;
            }
        }
        System.out.println(tmp);
    }
}
