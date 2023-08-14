package pro;

import java.util.Arrays;

public class pro_42748 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = new int[commands.length];
        int[] numArr = new int[commands.length];

        for(int i = 0; i < commands.length; i++){
            int tmp = 0;
            int[] inArr = commands[i];


            for(int j = 0; j < inArr.length; j++){
                numArr[tmp] = inArr[j];
                tmp++;
            }
            int[] tmpArr = new int[numArr[1] - numArr[0] + 1];
            int cnt2 = 0;

            for(int j = numArr[0] - 1; j < numArr[1]; j++){
                tmpArr[cnt2] += array[j];
                cnt2++;
            }

            Arrays.sort(tmpArr);

            answer[i] = tmpArr[numArr[2] - 1];

        }

    }
}
