package doit_algo;

import java.util.Scanner;

public class doit_007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int num1 = 6;
        int count = 0;
        int sum = 9;

        int[] num1Arr = new int[]{2, 7, 4, 1, 5, 3};
//        for(int i = 0; i < num1; i++){
//            num1Arr[i] = sc.nextInt();
//        }

        for(int i = 0; i < num1 - 1; i++){
            for(int j = i; j < num1; j++){
                int tmp = 0;
                if(num1Arr[i] > num1Arr[j]){
                    tmp = num1Arr[i];
                    num1Arr[i] = num1Arr[j];
                    num1Arr[j] = tmp;
                }
            }
        }

        int i = 0;
        int j = num1 - 1;
        while (i < j){
            if(num1Arr[i] + num1Arr[j] < sum){
                i++;
            } else if(num1Arr[i] + num1Arr[j] > sum){
                j--;
            } else {
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);



    }
}
