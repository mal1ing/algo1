package baek;

import java.util.Scanner;

public class baek_2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int[][] num1Arr = new int[num1][num2];
        int[][] num2Arr = new int[num1][num2];

        for(int i = 0; i < num1; i++){
            for(int j = 0; j < num2; j++){
                num1Arr[i][j] += sc.nextInt();
            }
        }

        for(int i = 0; i < num1; i++){
            for(int j = 0; j < num2; j++){
                num2Arr[i][j] += sc.nextInt();
            }
        }

        for(int i = 0; i < num1; i++){
            for(int j = 0; j < num2; j++){
                num1Arr[i][j] = num1Arr[i][j] + num2Arr[i][j];
            }
        }

        for(int i = 0; i < num1; i++){
            for(int j = 0; j < num2; j++){
                System.out.print(num1Arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
