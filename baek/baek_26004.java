package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_26004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] hirac = {"H", "I", "R", "A", "C"};
        int[] numArr = new int[5];
        int num1 = Integer.parseInt(br.readLine());

        String str = br.readLine();
        String[] strArr = str.split("");

        for(int i = 0; i < hirac.length; i++){
            for(int j = 0; j < strArr.length; j++){
                if(strArr[j].equals(hirac[i])){
                    numArr[i]++;
                }
            }
        }


    }
}
