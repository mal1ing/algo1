package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_13458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        int[] num1Arr = new int[num1];
        int[] watcherP = new int[2];
        long watcher = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(long i = 0; i < num1; i++){
           num1Arr[(int) i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 2; i++){
            watcherP[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < num1; i++){
            num1Arr[i] = num1Arr[i] - watcherP[0];
            watcher++;

            if(num1Arr[i] <= 0){
                continue;
            }

            watcher += num1Arr[i] / watcherP[1];
            if(num1Arr[i] % watcherP[1] != 0){
                watcher++;
            }

        }

        System.out.println(watcher);

    }
}
