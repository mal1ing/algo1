package doit_algo;

import java.util.Scanner;

public class doit_002_mySol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int[] numArr = new int[num1];

        for(int i = 0; i < numArr.length; i++){
            numArr[i] = sc.nextInt();
        }
        long sum = 0;
        long max = 0;

        for(int i = 0; i < numArr.length; i++){
            sum += numArr[i];
            if(numArr[i] > max){
                max = numArr[i];
            }
        }
        long res = sum / max * 100 / numArr.length;
        System.out.println(sum * 100.0 / max  / numArr.length);
    }
}
