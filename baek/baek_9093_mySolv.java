package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_9093_mySolv {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());

        for(int i =0; i < num1; i++){
            String str = br.readLine();
            String[] strArrr = str.split(" ");
            for(int j = 0; j < strArrr.length; j++){
                for(int k = strArrr[j].length() - 1; k >= 0; k--){
                    System.out.print(strArrr[j].charAt(k));
                }
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
