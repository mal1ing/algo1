package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_3040 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numArr = new int[9];

        int sum = 0;

        for(int i = 0; i < 9; i++){
            numArr[i] = Integer.parseInt(br.readLine());
            sum += numArr[i];
        }

        for(int i = 0; i < 8; i++){
            for(int j = 1; j < 9; j++){
                if(sum - numArr[i] - numArr[j] == 100){
                    for(int k = 0; k < 9; k++){
                        if(numArr[k] != numArr[i] && numArr[k] != numArr[j]){
                            System.out.println(numArr[k]);
                        }
                    }
                    return;
                }
            }
        }
    }
}
