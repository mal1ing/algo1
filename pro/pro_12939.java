package pro;

import java.util.Arrays;

public class pro_12939 {
    public static void main(String[] args) {
        String s = "-3 -4 -1 -2";
        String[] sArr = s.split(" ");
        int[] numArr = new int[sArr.length];

        for(int i = 0; i < numArr.length; i++){
            numArr[i] = Integer.parseInt(sArr[i]);
        }

        Arrays.sort(numArr);

        String answer = "";
        answer = String.valueOf(numArr[0]) + " " + String.valueOf(numArr[numArr.length - 1]);
        System.out.println(answer);
    }
}
