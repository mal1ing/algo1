package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baek_11948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] mainSub = new int[4];
        int[] subSub = new int[2];

        for(int i = 0; i < 4; i++){
            mainSub[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 0; i < 2; i++){
            subSub[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(mainSub);
        Arrays.sort(subSub);
        System.out.println(mainSub[1] + mainSub[2] + mainSub[3] + subSub[1]);
    }
}
