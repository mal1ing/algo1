package doit_algo;

import java.util.Scanner;

public class doit_006_bookSol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;
        while(end_index != num1){
            if(sum == num1){        // 현재 연속 합이 num1 과 같을 경우
                count++;
                end_index++;
                sum = sum + end_index;
            } else if(sum > num1){  // 현재 연속 합이 num1보다 클 경우
                sum = sum - start_index;
                start_index++;
            } else {                // 현재 연속 합이 N보다 작은 경우
                end_index++;
                sum = sum + end_index;
            }
        }
        System.out.println(count);
    }
}
