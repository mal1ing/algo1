package baek;

import java.util.Scanner;

public class baek_15969 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int[] num1Arr = new int[num1];

        for(int i = 0; i < num1; i++){
            num1Arr[i] = sc.nextInt();
        }

        int max =  0;
        for(int i = 0; i < num1Arr.length; i++){
            if(num1Arr[i] > max){
                max = num1Arr[i];
            }
        }

        int min = 1001;
        for(int i = 0; i < num1Arr.length; i++){
            if(num1Arr[i] < min){
                min = num1Arr[i];
            }
        }

        System.out.println(max - min);
    }
}
