package baek;

import java.util.Scanner;

public class baek_9713 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();

        for(int i = 0; i < num1; i++){
            int num2 = scan.nextInt();
            int sum = 0;
            for(int j = 1; j <= num2; j++){
                if(j % 2 == 1){
                    sum += j;
                }
            }
                System.out.println(sum);

        }
    }
}
