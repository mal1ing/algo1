package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_2774 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] dexArr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        int num1 = Integer.parseInt(br.readLine());

        for(int i = 0; i < num1; i++){
            String nums = br.readLine();
            String[] numsArr = nums.split("");
            int[] dexIntArr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

            for(int j = 0; j < numsArr.length; j++){
                for(int k = 0; k < dexArr.length; k++){
                    if(numsArr[j].equals(dexArr[k])){
                        dexIntArr[k]++;
                    }
                }
            }

            int result = 0;
            for(int j = 0; j < dexIntArr.length; j++){
                if(dexIntArr[j] > 0){
                    result++;
                }
            }

            System.out.println(result);
        }

    }
}
