package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_5523 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int left = 0;
        int right = 0;


        for(int i = 0; i < num1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int leftNum = Integer.parseInt(st.nextToken());
            int rightNum = Integer.parseInt(st.nextToken());
            if(leftNum > rightNum){
                left++;
            } else if(rightNum > leftNum){
                right++;
            }
        }

        System.out.println(left + " " + right);
    }
}
