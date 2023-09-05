package leet;

import java.util.HashMap;
import java.util.Map;

public class leet_roman_to_integer {
    public static void main(String[] args) {
        Map<Character, Integer> ro = new HashMap<>();

        String s = "MCMXCIV";

        ro.put('I', 1);
        ro.put('V', 5);
        ro.put('X', 10);
        ro.put('L', 50);
        ro.put('C', 100);
        ro.put('D', 500);
        ro.put('M', 1000);

        int sum = 0;

        for (int i = 0; i < s.length(); i++){
            if(i < s.length() - 1 && ro.get(s.charAt(i)) < ro.get(s.charAt(i + 1))){
                sum -= ro.get(s.charAt(i));
            } else {
                sum += ro.get(s.charAt(i));
            }
        }

        System.out.println(sum);
    }
}
