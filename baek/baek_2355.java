package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_2355 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long num1 = Long.parseLong(st.nextToken());
        long num2 = Long.parseLong(st.nextToken());


        long min = Math.min(num1, num2);
        long max = Math.max(num1, num2);

        long sum = (((max + 1) * max) / 2) - (((min - 1) * min) / 2);

        System.out.println(sum);
    }
}
