package baek;

import java.util.Scanner;

public class baek_10809 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] alpabet = new int[26];
        for(int i = 0; i < alpabet.length; i++){
            alpabet[i] = -1;
        }

        String str = scan.nextLine();

        for(int i = 0; i < str.length(); i++){
            char strChar = str.charAt(i);

            if(alpabet[strChar - 'a'] == -1){
                alpabet[strChar - 'a'] = i;
            }
        }

        for(int i = 0; i < alpabet.length; i++){
            System.out.print(alpabet[i] + " ");
        }

    }
}
