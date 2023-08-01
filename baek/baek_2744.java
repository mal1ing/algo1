package baek;

import java.util.Scanner;

public class baek_2744 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        Character[] str1Arr = new Character[str1.length()];

        for(int i = 0; i < str1.length(); i++){
            str1Arr[i] = str1.charAt(i);
        }

        for(int i = 0; i < str1.length(); i++){
            if(Character.isUpperCase(str1Arr[i])){
                System.out.print(Character.toLowerCase(str1Arr[i]));
            } else{
                System.out.print(Character.toUpperCase(str1Arr[i]));
            }
        }
    }
}

