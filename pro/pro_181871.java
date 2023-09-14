package pro;

import java.util.ArrayList;

public class pro_181871 {
    public static void main(String[] args) {
        String myString = "banana";
        String pat = "ana";

        String[] myStringArr = myString.split("");

        int cnt = 0;
        String str = "";

        int result = 0;
        while (cnt != myStringArr.length){
            str += myStringArr[cnt];
            cnt++;

            if(str.length() == pat.length()){
                if(str.equals(pat)){
                    result++;
                }

                cnt -= pat.length() - 1 ;
                str = "";
            }
        }

        System.out.println(result);
    }
}
