package pro;

import java.util.Locale;

public class pro_12951 {
    public static void main(String[] args) {
        String s = "3people Unfollowed Me ";
        String answer = "";
        String[] sArr = s.split("");


        int cnt = 0;

        String tmp = " ";
        for(int i = 0; i < sArr.length; i++){
            if(tmp.equals(" ")){
                answer += sArr[i].toUpperCase();
            } else {
                answer += sArr[i].toLowerCase();
            }
            tmp = "";
            tmp += sArr[i];
        }

        System.out.println(answer);




    }
}
