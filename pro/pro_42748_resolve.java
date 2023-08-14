package pro;

import java.util.ArrayList;
import java.util.Collections;

public class pro_42748_resolve {
    public static void main(String[] args) {
        int array[] = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++){
            int[] numArr = new int[commands.length];

            for(int j = 0; j < commands.length; j++){
                numArr[j] = commands[i][j];
            }
            ArrayList<Integer> list = new ArrayList();
            for(int j = numArr[0] - 1; j < numArr[1]; j++){
                list.add(array[j]);
            }

            Collections.sort(list);

            answer[i] += list.get(numArr[2] - 1);

        }
    }
}
