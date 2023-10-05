package pro;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class pro_120852 {
    public static void main(String[] args) {
        int n = 420;
        String div = "";
        int cnt = 2;

        while (n != 1){
            if(n % cnt == 0){
                n = n / cnt;
                div += String.valueOf(cnt) + " ";
                cnt = 2;
            } else {
                cnt++;
            }
        }

        String[] strArr = div.split(" ");

        int[] answer = new int[strArr.length];
        for(int i = 0 ; i < strArr.length; i++){
            answer[i] = Integer.parseInt(strArr[i]);
        }

        Set<Integer> setDiv = new HashSet<>();
        for(int i = 0; i < answer.length; i++){
            setDiv.add(answer[i]);
        }



        Integer[] arr = setDiv.toArray(new Integer[0]);
        Arrays.sort(arr);

        int[] rst = new int[arr.length];
        for(int i = 0 ; i < rst.length; i++){
            rst[i] = arr[i];
        }
    }
}
