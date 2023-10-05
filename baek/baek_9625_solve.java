package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_9625_solve {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());

        int aNum = 0;
        int bNum = 1;
        int sum = 0;

        for(int i = 1; i <  num1; i++){
            sum = aNum + bNum;
            aNum = bNum;
            bNum = sum;
        }

        System.out.println(aNum + " " + bNum);
    }
}
