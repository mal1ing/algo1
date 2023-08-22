package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_1929_sol {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        boolean[] prime = new boolean[num2 + 1];
        prime[0] = prime[1] = true;
        for(int i = 2; i <= Math.sqrt(prime.length); i++){
            if(prime[i]){
                continue;
            }
            for(int j = i * i; j < prime.length; j += i){
                prime[j] = true;
            }
        }

        for(int i = num1; i <= num2; i++){
            if(!prime[i]){
                System.out.println(i);
            }
        }


    }
}
