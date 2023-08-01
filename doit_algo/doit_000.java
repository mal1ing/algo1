package doit_algo;

import java.util.Scanner;

public class doit_000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int[] numArr = new int[num1];
        for(int i = 0; i < numArr.length; i++){
            numArr[i] = sc.nextInt();
        }

        for(int i = 0; i < numArr.length -1; i++){
            for(int j = i; j < numArr.length; j++){
                if(numArr[i] > numArr[j]){
                    int tmp = numArr[i];
                    numArr[i] = numArr[j];
                    numArr[j] = tmp;
                }
            }
        }

        for(int i= 0; i < numArr.length; i++){
            System.out.println(numArr[i]);
        }
    }
}
