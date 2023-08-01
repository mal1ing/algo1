package baek;

import java.util.Scanner;

public class baek_2875 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int woman = sc.nextInt();
        int man = sc.nextInt();
        int intern = sc.nextInt();
        int count = 0;

        while(woman >= 2 && man >= 1 && woman + man >= 3 + intern){
            woman = woman - 2;
            man--;
            count++;
        }

        System.out.println(count);
    }
}
