package pro;

import java.util.Arrays;

public class pro_120890 {
    public static void main(String[] args) {
        int[] array = {1, 4, 2, 1};
        Arrays.sort(array);
        int n = 3;

        int tmp = 1000;
        int sum = 0;

        for(int i = 0 ; i < array.length; i++){
            int num1 = Math.abs(n - array[i]);
            if(num1 < tmp){
                tmp = num1;
                sum = array[i];
            }
        }
        System.out.println(sum);
    }
}
