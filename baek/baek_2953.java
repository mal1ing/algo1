package baek;

import java.util.Scanner;

public class baek_2953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int tmp = 0;
        int num = 0;
        for(int i = 0; i < 5; i++){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
            int num4 = sc.nextInt();
            tmp = num1 + num2 + num3 + num4;

            if(sum < tmp){
                sum = tmp;
            }
            if(sum == tmp) {
                num = i + 1;
            }
        }
        System.out.print(num + " " + sum);
    }
}
