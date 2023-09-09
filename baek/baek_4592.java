package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_4592 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());

            if(num1 == 0){
                break;
            }

            int[] numArr = new int[num1];
            for(int j = 0; j < num1; j++){

                numArr[j] = Integer.parseInt(st.nextToken());

            }


            String tmp = "";
            int tmpInt = 0;

            for(int j = 0; j < numArr.length; j++){
                if(tmpInt != numArr[j]){
                    tmpInt = numArr[j];
                    tmp += String.valueOf(numArr[j]) + " ";
                }

            }

            System.out.println(tmp + "$");


        }
    }
}
