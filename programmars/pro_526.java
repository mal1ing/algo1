package programmars;

import java.util.Scanner;

public class pro_526 {
    public static void main(String[] args) {
        int n = 3;
        int[] numlist = new int[]{4,5,6,7,8,9,10,11,12};

        int res = 0;
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                res++;
            }
        }
        int[] answer = new int[res];
        int num = 0;
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                answer[num] = numlist[i];
                num++;
            }
        }

        for(int i = 0; i < answer.length; i++){
            System.out.print(answer[i] + " ");
        }
    }
}
