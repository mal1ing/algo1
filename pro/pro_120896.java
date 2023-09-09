package pro;

import java.util.Arrays;

public class pro_120896 {
    public static void main(String[] args) {
        String[] alp = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
        "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int[] alpNum = new int[26];

        String s = "hello";
        String[] sArr = s.split("");

        for(int i = 0; i < sArr.length; i++){
            for(int j = 0 ; j < alp.length; j++){
                if(sArr[i].equals(alp[j])){
                    alpNum[j]++;
                }
            }
        }

        String answer = "";
        for(int i = 0; i < alpNum.length; i++){
            if(alpNum[i] == 1){
                answer += alp[i];
            }
        }
        String[] answerArr = answer.split("");
        Arrays.sort(answerArr);
        answer = "";
        for(int i = 0; i < answerArr.length; i++){
            answer += answerArr[i];
        }

        System.out.println(answer);
    }
}
