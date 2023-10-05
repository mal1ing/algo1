package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_20528 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        char start;

        String str = br.readLine();
        String[] strArr = str.split(" ");

        int sum = 0;
        start = strArr[0].charAt(0);
        for(int i = 0; i < strArr.length; i++){
            int length = strArr[i].length();
            if(strArr[i].charAt(0) == start && strArr[i].charAt(length - 1) == start){
                sum++;
            }
        }
        if (sum == num1){
            System.out.println(1);
        } else {
            System.out.println(0);
        }


    }
}
