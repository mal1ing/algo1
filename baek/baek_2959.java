package baek;

import java.util.Arrays;
import java.util.Scanner;

public class baek_2959 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int[] rectArr = new int[4];
         for(int i = 0; i < rectArr.length; i++){
            rectArr[i] = sc.nextInt();
         }

         Arrays.sort(rectArr);

        System.out.println(rectArr[0] * rectArr[2]);

    }
}
