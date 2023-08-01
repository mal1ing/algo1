package baek;

import java.util.Scanner;

public class baek_10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] alp = new String[]{"a", "b", "c" , "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"
        , "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int[] alpInt = new int[alp.length];

        String str = sc.next();
        String[] strArr = str.split("");
        int tmp = 0;

        for(int i = 0; i < alp.length; i++){
            for(int j = 0; j < strArr.length; j++){
                if(alp[i].equals(strArr[j])){
                    alpInt[i]++;
                }
            }
        }

        for(int i = 0; i < alp.length; i++){
            System.out.print(alpInt[i] + " ");
        }

    }
}
