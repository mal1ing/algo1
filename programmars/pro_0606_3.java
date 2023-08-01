package programmars;

import java.util.Scanner;

public class pro_0606_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] my_strings = new String[]{"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts= new int[][]{{0, 4}, {1, 2}, {3, 5}, {7,7}};
        String answer = "";
        for(int i = 0; i < my_strings.length; i++){
            String str = my_strings[i];
            answer += str.substring(parts[i][0], parts[i][1] + 1);
        }

        System.out.println(answer);

    }
}
