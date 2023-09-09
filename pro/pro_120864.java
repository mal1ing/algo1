package pro;

import java.util.ArrayList;
import java.util.List;

public class pro_120864 {
    public static void main(String[] args) {
        String my_string = "aAB1B2cC34oOp";
        String[] strArr = my_string.split("[a-zA-Z]");

        int sum = 0;
        for(int i = 0; i < strArr.length; i++){
            sum += !strArr[i].isEmpty() ? Integer.parseInt(strArr[i]) : 0;
        }

        System.out.println(sum);

    }
}
