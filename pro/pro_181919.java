package pro;

import java.util.ArrayList;

public class pro_181919 {
    public static void main(String[] args) {
        int n = 10;

        ArrayList<Integer> colaz = new ArrayList<>();

        colaz.add(n);

        for(int i = 0; ; i++){


            if(n % 2 == 0){
                n /= 2;
                colaz.add(n);

                if(n == 1){
                    break;
                }
            } else {
                n = (3 * n) + 1;
                colaz.add(n);
            }
        }
        int[] answer = new int[colaz.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = colaz.get(i);
        }


    }
}
