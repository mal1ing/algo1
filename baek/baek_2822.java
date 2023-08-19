package baek;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baek_2822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numArr = new int[8];
        int[] numArrSort = new int[8];

        for(int i = 0; i < 8; i++){
            numArr[i] = Integer.parseInt(br.readLine());
            numArrSort[i] = numArr[i];
        }

        Arrays.sort(numArrSort);

        int sum = 0;
        for(int i = 3; i < numArrSort.length; i++){
            sum += numArrSort[i];
        }
        System.out.println(sum);
        int[] result = new int[5];
        int tmp = 0;
        for(int i = 0; i < numArr.length; i++){
            for(int j = 3; j < numArrSort.length; j++){
                if(numArr[i] == numArrSort[j]){
                    result[tmp] = i + 1;
                    tmp++;
                }
            }
        }

        for(int n : result){
            System.out.print(n + " ");
        }

    }
}
