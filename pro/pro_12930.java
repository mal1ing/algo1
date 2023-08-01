package pro;

import java.util.Locale;

public class pro_12930 {
    public static void main(String[] args) {
        String s = " aBc   aBc   aBc ";
        String answer = "";
        String[] strArr = s.split("");
        int cnt = 0;

        for(int i = 0; i < strArr.length; i++){
            if(strArr[i].equals(" ")){
                cnt = 1;
            }

            answer += cnt % 2 == 0 ? strArr[i].toUpperCase() : strArr[i].toLowerCase();
            cnt++;
        }

        System.out.println(answer);

    }
}
