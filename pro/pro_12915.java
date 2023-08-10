package pro;

import java.util.*;

public class pro_12915 {
    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;

        String[] answer = new String[strings.length];

        List<String> list = new ArrayList<>();

        for(int i = 0; i < strings.length; i++){
            list.add(strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(list);

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i).substring(1);
        }

        for(int i = 0; i < answer.length; i++){
            System.out.println(answer[i]);
        }


    }
}
