package pro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pro_9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());

        int[] array = new int[11];

        array[1] = 1;
        array[2] = 2;
        array[3] = 4;

        int a = 0;
        for(int i = 0; i < num1; i++){
            a = Integer.parseInt(br.readLine());
            for(int j = 4; j <= a; j++){
                array[j] = array[j - 1] + array[j - 2] + array[j - 3];
            }
            System.out.println(array[a]);
        }


    }
}
