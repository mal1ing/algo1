package baek;

import java.util.Scanner;

public class baek_10103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int chang = 100;
        int duck = 100;

        int num1 = sc.nextInt();
        for(int i = 0; i < num1; i++){
            int changNum = sc.nextInt();
            int duckNum = sc.nextInt();
            if(changNum > duckNum){
                duck -= changNum;
            } else if(changNum < duckNum){
                chang -= duckNum;
            }
        }
        System.out.println(chang);
        System.out.println(duck);

    }
}
