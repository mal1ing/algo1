package pro;

import java.util.HashMap;
import java.util.Map;

public class pro_120886 {
    public static void main(String[] args) {
        String[] alp = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
                "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int[] alpInt = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int[] alpInt2 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        String before = "olleh";
        String after = "hello";


        String[] beArr = before.split("");
        String[] afArr = after.split("");

        for(int i = 0; i < beArr.length; i++){
            for(int j = 0; j < alp.length; j++){
                if(beArr[i].equals(alp[j])){
                    alpInt[j]++;
                }
            }
        }

        for(int i = 0; i < afArr.length; i++){
            for(int j = 0; j < alp.length; j++){
                if(afArr[i].equals(alp[j])){
                    alpInt2[j]++;
                }
            }
        }

        int tmp = 0;
        for(int i = 0; i < alp.length; i++){
                if(alpInt[i] > 0 && alpInt2[i] == alpInt[i]){
                    tmp += alpInt[i];
            }
        }

        if(tmp == beArr.length){
            System.out.println(1);
        } else {
            System.out.println(0);
        }



    }
}
