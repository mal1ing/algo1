package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_5032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int[] res = new int[3];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 3; i++){

            res[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        int cnt = 0;
        sum = res[0] + res[1];
        for(int i = 0; ; i++){

            if(sum < res[2]){
                break;
            }

            sum = sum - res[2];

            sum++;
            cnt++;


        }

        System.out.println(cnt);



    }
}
