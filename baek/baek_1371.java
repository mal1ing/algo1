package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baek_1371 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] alp = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
        "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        int[] alpInt = new int[26];
        int[] alpInt2 = new int[26];

        String str = "";
        String input;
        while ((input = br.readLine()) != null){
            str += input;
        }

        System.out.println(str);




        String[] strArr = str.split("");

        for(int i = 0; i < strArr.length; i++){
            for(int j = 0; j < alp.length; j++){
                if(strArr[i].equals(alp[j])){
                    alpInt[j]++;
                    alpInt2[j]++;
                }
            }
        }

        Arrays.sort(alpInt2);

        int max = alpInt2[25];


        for(int i = 0; i < alp.length; i++){
            if(max == alpInt[i]){
                System.out.print(alp[i]);
            }
        }

    }
}
