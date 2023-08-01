package programmars;

import java.util.Scanner;

class Solution2 {
    public String solution(String str1, String str2){
        String answer = "";
        String[] str1Arr = str1.split("");
        String[] str2Arr = str2.split("");
        for(int i = 0; i < str1.length(); i++){
            answer += (str1Arr[i] + str2Arr[i]);
        }
        return answer;
    }
}
public class pro11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        Solution2 solution = new Solution2();
        System.out.println(solution.solution(str1, str2));
    }
}
