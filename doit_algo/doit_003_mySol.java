package doit_algo;

import java.util.Scanner;

public class doit_003_mySol{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int[] num2Arr = new int[num1];
        for(int i = 0; i < num2Arr.length; i++){
            num2Arr[i] = sc.nextInt();
        }

        for(int i = 0; i < num2; i++){
            int sum = 0;
            int num3 = sc.nextInt();
            int num4 = sc.nextInt();
            for(int j = num3; j <= num4; j++){
                sum += num2Arr[j - 1];
            }
            System.out.println(sum);
        }
    }
}
