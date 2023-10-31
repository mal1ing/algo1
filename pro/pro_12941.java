package pro;

import java.util.Arrays;
import java.util.Collections;

public class pro_12941 {
    public static void main(String[] args) {
        int[] A = {1, 2};
        int[] B = {3, 4};

        Integer[] BArr = new Integer[B.length];
        for(int i = 0; i < BArr.length; i++){
            BArr[i] = B[i];
        }

        Arrays.sort(A);
        Arrays.sort(BArr, Collections.reverseOrder());
        for(int i = 0; i < BArr.length; i++){
            B[i] = BArr[i];
        }

        int sum = 0;
        for(int i = 0; i < A.length; i++){
            sum += A[i] * B[i];
        }

        System.out.println(sum);


    }
}
