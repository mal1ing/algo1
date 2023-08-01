package baek;

import java.util.Scanner;

public class baek_5565 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ten = sc.nextInt();

        for(int i = 0; i < 9; i++){
            int book = sc.nextInt();
            ten = ten - book;

        }

        System.out.println(ten);
    }
}
