package programmars;

import java.util.Scanner;

class Solution {
    public String solution(String my_string, String overwrite_string, int s){
        String answer = my_string.substring(0, s) + overwrite_string.substring(0, overwrite_string.length()) + my_string.substring(s + overwrite_string.length(), my_string.length());
        return answer;
    }
public class pro10 {

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1 = scan.next();
        String str2 = scan.next();
        int num = scan.nextInt();


        Solution solution = new Solution();
        System.out.println(solution.solution(str1,str2,num));


    }
}
