package baek;

import java.util.Scanner;

public class baek_10797 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

        int tmp = 0;
        for(int i = 0; i < 5; i++){
            int answer = sc.nextInt();
            if(num1 == answer){
                tmp++;
            }
        }

        System.out.println(tmp);
    }
}
