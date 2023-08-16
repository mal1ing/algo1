package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());

        for(int i = 0; i < num1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int height = Integer.parseInt(st.nextToken());
            int area = Integer.parseInt(st.nextToken());
            int myRoom = Integer.parseInt(st.nextToken());

            int sum = 1;
            String result = "";

            for(int j = 1; j <= area; j++){
                for(int k = 1; k <= height; k++){
                    String str = "";
                    str += String.valueOf(k);
                    if(String.valueOf(j).length() == 1){
                        str += "0" + String.valueOf(j);
                    } else {
                        str += String.valueOf(j);
                    }
                    if(sum == myRoom){
                        result = str ;
                    }

                    sum++;
                }
            }

            System.out.println(result);
        }
    }
}
