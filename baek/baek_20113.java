package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_20113 {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        int[] num1Arr = new int[num1];

        String tmp = br.readLine();
        String[] tmpArr = tmp.split(" ");
        for(int j = 0; j < tmpArr.length; j++){
            if(Integer.parseInt(tmpArr[j]) != 0){
                num1Arr[Integer.parseInt(tmpArr[j]) - 1]++;

            } else {
                continue;
            }
        }


        int high = 0;
        int highNum = 0;
        for(int i = 0; i < num1Arr.length; i++){
            if(num1Arr[i] > high){
                high = num1Arr[i];
                highNum = i + 1;
            }
        }

        int pilter = 0;
        for(int i = 0; i < num1Arr.length; i++){
            if(high == num1Arr[i]){
                pilter++;
            }
        }

        if(pilter > 1){
            System.out.println("skipped");
        } else {
            System.out.println(highNum);
        }
    }
}
