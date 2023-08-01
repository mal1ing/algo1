package pro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class pro_12969 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strArr = str.split(" ");
        int a = Integer.parseInt(strArr[0]);
        int b = Integer.parseInt(strArr[1]);

        for(int i = 0; i < b; i++){
            for(int j = 0; j < a; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
