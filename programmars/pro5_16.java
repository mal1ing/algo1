package programmars;

import java.util.Arrays;
import java.util.Scanner;

public class pro5_16 {
    public static void main(String[] args) {
        int answer = 0;
        int[] arr = new int[]{ 7, 1, 2, 5 ,13};
        Arrays.sort(arr);
        answer = arr[arr.length / 2];
        System.out.println(answer);

    }
}
