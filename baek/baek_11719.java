package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_11719 {
    public static void main(String[] args) throws IOException {
        String str = inputStr();
        System.out.println(str);
    }

    public static String inputStr() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = st.nextToken();

        return str;
    }
}
