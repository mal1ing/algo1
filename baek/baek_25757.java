package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class baek_25757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        String game = st.nextToken();
        ArrayList<String> person = new ArrayList<>();
        ArrayList<String> NcontainP = new ArrayList<>();

        for(int i = 0; i < num1; i++){
            String ps = br.readLine();
            person.add(ps);
        }

        for(String item : person){
            if(!NcontainP.contains(item)){
                NcontainP.add(item);
            }
        }

        int cnt = 0;
        int len = NcontainP.size();
        if(game.equals("Y")){
            while (len > 0){
                len = len - 1;
                cnt++;
            }
        } else if(game.equals("F")){
            while (len > 1){
                len = len - 2;
                cnt++;
            }
        } else if(game.equals("O")){
            while (len > 2){
                len = len - 3;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
