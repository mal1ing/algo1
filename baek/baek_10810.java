package baek;

import java.io.*;
import java.util.StringTokenizer;

public class baek_10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int arrLength = Integer.parseInt(st.nextToken());
        int[] arr = new int[arrLength];
        int cycle = Integer.parseInt(st.nextToken());


        for(int i = 0; i < cycle; i++){
            st = new StringTokenizer(br.readLine());
            int startBasket = Integer.parseInt(st.nextToken());
            int endBasket = Integer.parseInt(st.nextToken());
            int value = Integer.valueOf(st.nextToken());


            for(int j = startBasket - 1; j < endBasket; j++){
                arr[j] = value;
            }
        }


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int num : arr){
            bw.write(num + " ");
        }

        bw.close();
    }
}
