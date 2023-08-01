package doit_algo;

import java.util.Scanner;

public class doit_006_sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

        int start_index = 1;
        int end_index = 1;
        int sum = 1;

        int count = 1;

        while(end_index != num1){
            if(sum == num1){
                count++;
                end_index++;
                sum += end_index;
            } else if(sum > num1){
                sum = sum - start_index;
                start_index++;
            } else {
                end_index++;
                sum = sum + end_index;
            }
        }

        System.out.println(count);


    }
}
