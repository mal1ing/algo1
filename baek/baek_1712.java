package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int num3 = Integer.parseInt(st.nextToken());

        int result = bp(num1,num2,num3);
        System.out.println(result);

    }

    public static int bp(int num1, int num2, int num3){
        if(num2 >= num3){
            return -1;
        } else {
            return (num1 / (num3 - num2)) + 1;
        }
    }
}
