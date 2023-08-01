package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < num1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()){
                StringBuilder sb = new StringBuilder(st.nextToken());
                ans.append(sb.reverse() + " ");
            }
            ans.append("\n");
        }
        System.out.print(ans);
    }
}
