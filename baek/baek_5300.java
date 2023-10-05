package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_5300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());

        for(int i = 1; i <= num1; i++){
            System.out.print(i + " ");
            if(i % 6 == 0 || i == num1){
                System.out.print("Go!" + " ");
            }
        }
    }
}
