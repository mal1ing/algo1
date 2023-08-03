package pro;

import java.util.Arrays;

public class pro_86491 {
    public static void main(String[] args) {
//        int[][] sizes = {{60, 50 }, {30, 70}, {60, 30}, {80, 40}};
        int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        int[] num1 = new int[sizes.length];
        int[] num2 = new int[sizes.length];
        for(int i = 0; i < sizes.length; i++){
            for(int j = 0; j < sizes[i].length; j++){
                if(sizes[i][0] > sizes[i][1]){
                    num1[i] = sizes[i][0];
                    num2[i] = sizes[i][1];
                } else {
                    num1[i] = sizes[i][1];
                    num2[i] = sizes[i][0];
                }
            }
        }

        Arrays.sort(num1);
        Arrays.sort(num2);

//        for(int i = 0; i < sizes.length; i++){
//            System.out.print("num1:" + num1[i] + " ");
//            System.out.print("num2:" + num2[i] + " ");
//            System.out.println();
//        }
        int num = num1[num1.length - 1] * num2[num2.length - 1];
        System.out.println(num);

    }
}
