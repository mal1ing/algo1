package baek;


import java.util.Scanner;

public class baek_2789 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1 = scan.nextLine();
        char[] str1CharArr= str1.toCharArray();

        for(int i = 0; i < str1CharArr.length; i++){
            if(str1CharArr[i] == 'C' || str1CharArr[i] == 'A' || str1CharArr[i] == 'M' || str1CharArr[i] == 'B'
            || str1CharArr[i] == 'R' || str1CharArr[i] == 'I' || str1CharArr[i] == 'D' || str1CharArr[i] == 'G'
            || str1CharArr[i] == 'E'){
                str1CharArr[i] = ' ';
            }
        }

        str1 = new String(str1CharArr).replaceAll(" ", "");
        System.out.println(str1);
    }
}
