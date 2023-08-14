package pro;

import java.util.Arrays;

public class pro_42748_resolve2 {
    public static void main(String[] args) {
        int array[] = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] answer = new int[commands.length];
        int[] result = {};

        int a , b , c = 0;

        for(int i = 0; i < commands.length; i++){
            a = commands[i][0];
            b = commands[i][1];
            c = commands[i][2];
            int cnt = 0;

            result = new int[b - a + 1];

            for(int j = a - 1; j <= b - 1; j++){
                result[cnt] = array[j];
                cnt++;
            }

            Arrays.sort(result);

            answer[i] = result[c - 1];
        }


    }
}
