package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_28062 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        int[] numArr = new int[num1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < num1; i++){
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        int sumEven = 0;
        int odd = 0;

        for(int i = 0; i < num1; i++){
            if(numArr[i] % 2 == 0){
                sumEven += numArr[i];
            }

            if(numArr[i] % 2 != 0){
                odd++;
            }
        }

        int[] oddArr = new int[odd];
        int oddSum = 0;
        int tmp = 0;
        for(int i = 0; i < numArr.length; i++){
            if(numArr[i] % 2 != 0){
                oddSum += numArr[i];
                oddArr[tmp] = numArr[i];
                tmp++;
            }
        }

        for(int i = 0; i < oddArr.length - 1; i++){
            for(int j = i; j < oddArr.length; j++){
                if(oddArr[i] > oddArr[j]){
                    int oddTmp = 0;
                    oddTmp = oddArr[i];
                    oddArr[i] = oddArr[j];
                    oddArr[j] = oddTmp;
                }
            }
        }

        for(int i = 0; i < oddArr.length; i++){
            if(oddSum % 2 != 0){
                oddSum -= oddArr[i];
            }
        }

        System.out.println(sumEven + oddSum);

    }
}
