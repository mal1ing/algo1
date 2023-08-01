package baek;

import java.util.Scanner;

public class baek_5988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        if(num1 != 0){
            for(int i = 0; i < num1; i++){
                String[] arr = sc.next().split("");
                System.out.println(Integer.parseInt(arr[arr.length - 1]) % 2 == 0 ? "even" : "odd");
            }
        }
    }
}
