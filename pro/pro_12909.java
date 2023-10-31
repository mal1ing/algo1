package pro;

import java.util.ArrayList;

public class pro_12909 {
    public static void main(String[] args) {
        String s = "(())()";

        int tmp = 0;
        int cnt = 0;
        while (cnt != s.length()){
            if(tmp < 0){
                break;
            }
            if(s.charAt(cnt) == '('){
                tmp++;
                cnt++;
            } else if(s.charAt(cnt) == ')'){
                tmp--;
                cnt++;
            }
        }

        boolean answer;
        if(tmp == 0){
            answer = true;
        } else {
            answer = false;
        }

        System.out.println(answer);
    }
}
