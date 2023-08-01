package pro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pro_12935_2 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        int[] answer;

        if(arr.length < 2){
            answer = new int[]{-1};
        } else {
            answer = new int[arr.length -1];

            int min = 1000;
            for(int i = 0; i < arr.length; i++){
                if(min > arr[i]){
                    min = arr[i];
                }
            }

            int tmp = 0;
            for(int i = 0; i < arr.length; i++){
                if(min == arr[i]){
                    continue;
                } else {
                    answer[tmp] = arr[i];
                    tmp++;
                }
            }
        }

        for(int i = 0; i < answer.length; i++){
            System.out.print(answer[i] + " ");
        }


    }
}
