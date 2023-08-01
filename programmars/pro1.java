package programmars;

import java.util.Locale;
import java.util.Scanner;

public class pro1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] aArr = a.split("");
        String[] aArrUpper = new String[aArr.length];

        for(int i = 0; i < aArr.length; i++){
            aArrUpper[i] = aArr[i].toUpperCase();
        }
        for(int i = 0; i < aArr.length; i++){
            System.out.print(aArrUpper[i]);
            System.out.println(aArr[i]);

        }

        for(int i = 0; i < aArr.length; i++){
            if(aArr[i].equals(aArrUpper[i])){
                System.out.print(aArr[i].toLowerCase(Locale.ROOT));
            } else {
                System.out.print(aArr[i].toUpperCase());
            }
        }

    }
}
