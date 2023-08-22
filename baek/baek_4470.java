package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_4470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        String[] name = new String[num1];
        for(int i = 0; i < num1; i++){
            name[i] = br.readLine();
        }

        for(int i = 0; i < num1; i++){
            System.out.println(i + 1 + ". " + name[i]);
        }
    }
}
