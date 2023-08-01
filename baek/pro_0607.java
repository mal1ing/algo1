package baek;

import java.util.Scanner;

public class pro_0607 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[]{"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        int sum = 0;

        for(int i = 0; i < names.length; i += 5){
            sum++;
        }

       String[] answer = new String[sum];
        int j = 0;
        for(int i = 0; i < names.length; i += 5){
            answer[j] = names[i];
            j++;
        }

        for(int i = 0; i < answer.length; i++){
            System.out.println(answer[i]);
        }

    }
}
