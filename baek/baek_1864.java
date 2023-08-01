package baek;

import java.util.Scanner;

public class baek_1864 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        for(int j = 0; ; j++){
            int sum = 0;
            String result1 = scan.nextLine();
            String[] resultArr = result1.split("");
            int[] resultInt = new int[result1.length()];

            if(result1.equals("#")){
                break;
            }


            for (int i = 0; i < result1.length(); i++) {
                if (resultArr[i].equals("-")) {
                    resultInt[i] += 0;
                } else if (resultArr[i].equals("\\")) {
                    resultInt[i] += 1;
                } else if (resultArr[i].equals("(")) {
                    resultInt[i] += 2;
                } else if (resultArr[i].equals("@")) {
                    resultInt[i] += 3;
                } else if (resultArr[i].equals("?")) {
                    resultInt[i] += 4;
                } else if (resultArr[i].equals(">")) {
                    resultInt[i] += 5;
                } else if (resultArr[i].equals("&")) {
                    resultInt[i] += 6;
                } else if (resultArr[i].equals("%")) {
                    resultInt[i] += 7;
                } else if (resultArr[i].equals("/")) {
                    resultInt[i] += -1;
                }
            }

            for(int i = 0; i < result1.length(); i++){
                sum += resultInt[i] * Math.pow(8, result1.length() - 1 - i);
            }

            System.out.println(sum);
        }
    }
}
