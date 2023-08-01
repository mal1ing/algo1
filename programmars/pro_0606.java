package programmars;

import java.util.Scanner;

public class pro_0606 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] todo_list = new String[]{"problem", "pratice", "swim", "study"};
        boolean[] finished = new boolean[]{true, false, true, false};
        int sum = 0;
        for(int i = 0; i < finished.length; i++){
            if(finished[i] == false){
                sum++;
            }
        }

        String[] answer = new String[sum];
        int j = 0 ;
        for(int i = 0; i < finished.length; i++){
            if(finished[i] == false){
                answer[j] = todo_list[i];
                j++;
            }
        }

        for(int i = 0; i < answer.length; i++){
            System.out.println(answer[i]);
        }


    }
}
