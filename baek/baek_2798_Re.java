package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_2798_Re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int card = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        int[] cardArr = new int[card];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < card; i++){
            cardArr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(cardArr, card, num));

    }

    //솔루션
    static int solution(int[] arr, int num1, int num2){
        int result = 0;

        for(int i = 0; i < num1 - 2; i++){

            for(int j = i + 1; j < num1 - 1; j++){

                for(int k = j + 1; k < num1; k++){

                    int tmp = arr[i] + arr[j] + arr[k];

                    if(tmp == num2){
                        return tmp;
                    }

                    if(tmp > result && tmp < num2){
                        result = tmp;
                    }
                }
            }
        }
        return result;
    }
}
