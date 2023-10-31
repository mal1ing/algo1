package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baek_15781 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int helkHigh = 0;
        int armHigh = 0;
        int[] helArr = new int[num1];
        int[] armArr = new int[num2];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < num1; i++){
            helArr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < num2; i++){
            armArr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(helArr);
        Arrays.sort(armArr);
        helkHigh = helArr[helArr.length -1];
        armHigh = armArr[armArr.length - 1];
        System.out.println(helkHigh + armHigh);
    }
}
