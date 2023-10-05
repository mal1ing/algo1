package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_9625 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // B => BA , A => B
        int num1 = Integer.parseInt(br.readLine());


        String tmp = "A";
        String str = "";
        for(int i = 0; i < num1; i++){
            String[] tmpArr = tmp.split("");
            for(int j = 0; j < tmpArr.length; j++){
                if(tmpArr[j].equals("A")){
                    str += "B";
                } else if(tmpArr[j].equals("B")){
                    str += "BA";
                }
                tmp = str;
            }
            str = "";
        }

        String[] tmpArr = tmp.split("");
        int aNum = 0;
        int bNum = 0;
        for(int i = 0; i < tmpArr.length; i++){
            if(tmpArr[i].equals("A")){
               aNum++;
            } else if(tmpArr[i].equals("B")){
                bNum++;
            }
        }


        System.out.println(aNum + " " + bNum);
    }
}
