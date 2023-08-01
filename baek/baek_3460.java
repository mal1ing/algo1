package baek;

import java.util.Scanner;

public class baek_3460 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int depth = 0;
        // 일단 배열의 크기를 구하자
        for(int i = 0; i < num1; i++){
            int num2 = sc.nextInt();
            int k = num2;
            for(int j = 0; ; j++){
                if(k == 0){
                    break;
                }
                k = k / 2;
                depth++;

            }

            int[] num2Arr = new int[depth];
            for(int j = 0; j < num2Arr.length; j++){
                num2Arr[j] = num2 % 2;
                num2 = num2 / 2;
            }

            for(int j = 0; j < num2Arr.length; j++){
                if(num2Arr[j] == 1){
                    System.out.print(j + " ");
                }
            }
        }

    }
}
