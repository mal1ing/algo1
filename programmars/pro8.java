package programmars;

import java.util.Scanner;

public class pro8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] sArr = s.split("");

        for(int i = 0; i < sArr.length; i++){
            System.out.println(sArr[i]);
        }
    }
}
