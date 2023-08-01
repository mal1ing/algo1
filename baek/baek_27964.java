package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class baek_27964 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        HashSet<Object> set = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < num1; i++){
            String cheese = st.nextToken();
            if(cheese.length() >= 6){
                String cheeses = cheese.substring(cheese.length() - 6, cheese.length());
                if(cheeses.equals("Cheese")){
                    set.add(cheese);
                }
            }
        }
        System.out.println(set.size() >= 4 ? "yummy" : "sad");

    }
}
