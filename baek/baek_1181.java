package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class baek_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());

        String[] str = new String[num1];

        for(int i = 0; i < num1; i++){
            str[i] = br.readLine();
        }

        Arrays.sort(str, new Comparator<String>() {
            public int compare(String s1, String s2){
                // 단어 길이가 같을 경우
                if(s1.length() == s2.length()){
                    return s1.compareTo(s2);
                }
                // 그 외의 경우
                else {
                    return s1.length() - s2.length();
                }
            }
        });

        StringBuilder sb = new StringBuilder();

        sb.append(str[0]).append('\n');

        for(int i = 1; i < num1; i++){
            if(!str[i].equals(str[i - 1])){
                sb.append(str[i]).append('\n');
            }
        }

        System.out.println(sb);


    }
}
