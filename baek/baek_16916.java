package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class baek_16916 {

    static int num1;
    static int[] table;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String str2 = br.readLine();

        table = new int[str2.length()];




    }
    public static int KMP(String str1, String str2){
        makeTable(str2);
        int str1length = str1.length();
        int str2length = str2.length();

        int idx = 0;

        for(int i = 0; i < str1length; i++){
            while (idx > 0 && str1.charAt(i) != str2.charAt(idx)){
                idx = table[idx - 1];
            }
            if(str1.charAt(i) == str2.charAt(idx)){
                if(idx == str2length - 1){
                    idx = table[idx];
                    return 1;
                }
                else {
                    idx+= 1;
                }
            }
        }
        return 0;
    }

    public static void makeTable(String str2){
        int n = str2.length();

        int idx = 0;
        for(int i = 1; i < n; i++){
            while (idx > 0 && str2.charAt(i) != str2.charAt(idx)){
                idx = table[idx - 1];
            }

            if(str2.charAt(i) == str2.charAt(idx)){
                idx++;
                table[i] = idx;
            }
        }
    }
}
