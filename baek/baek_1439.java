package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        String[] numArr = num.split("");
        int one = 0;
        int zero = 0;
        String tmp = "";
        if(numArr[0].equals("0")){
            zero++;
            tmp = "0";
        } else if(numArr[0].equals("1")){
            one++;
            tmp = "1";
        }

        for(int i = 1; i < numArr.length; i++){
            if(tmp.equals(numArr[i])){
                tmp = numArr[i];
            } else {
                if(numArr[i].equals("0")){
                    zero++;
                } else if(numArr[i].equals("1")){
                    one++;
                }
            }
//            System.out.println("numArr[" + i + "] :" + numArr[i] + " tmp : " +  tmp);
//            System.out.println("one : " + one + " zero : " + zero);
            tmp = numArr[i];
        }
        if(one > zero){
            System.out.println(zero);
        } else {
            System.out.println(one);
        }
    }
}
