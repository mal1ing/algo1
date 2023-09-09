package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_27918 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());

        int dal = 0;
        int pho = 0;

        for(int i = 0; i < num1; i++){
            String str = br.readLine();
            if(str.equals("D")){
                dal++;
            } else if(str.equals("P")){
                pho++;
            }

            if(dal > 0 && dal == pho + 2){
                break;
            } else if (pho > 0 && pho == dal + 2){
                break;
            }
        }

        System.out.println(dal + ":" + pho);

    }
}
