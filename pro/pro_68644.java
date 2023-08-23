package pro;

import java.util.*;

public class pro_68644 {
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                list.add(numbers[i] + numbers[j]);
            }
        }

        Set<Integer> set = new HashSet<>(list);

        List<Integer> newList = new ArrayList<>(set);

        int[] answer = new int[newList.size()];

        for(int i = 0; i < answer.length; i++){
            answer[i] = newList.get(i);
        }

        for(int n : answer){
            System.out.print(n + " ");
        }


        System.out.println(newList);


    }
}
