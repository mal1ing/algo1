package pro;

import java.util.Arrays;

public class pro_12982 {
    public static void main(String[] args) {
        int[] d = {2,2,3,3};
        int budget = 10;

        Arrays.sort(d);
        int result = 0;
        for(int i = 0; i < d.length; i++){
            if(budget >= d[i]){
                budget = budget - d[i];
                result++;
            } else {
                continue;
            }
        }

        System.out.println(result);
    }
}
