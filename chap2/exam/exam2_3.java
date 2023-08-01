package chap2.exam;

import java.util.Scanner;

public class exam2_3 {

    class MaxOfArray {
        // 배열 a의 최댓값을 구하는 반환
        static int maxOf(int[] a) {
            int max = a[0];
            for (int i = 0; i < a.length; i++) {
                if (a[i] > max) {
                    max = a[i];
                }
            }
            return max;
        }
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수:");
        int num = scan.nextInt();

        int[] height = new int[num];

        for(int i = 0; i < num; i++){
            System.out.print("height[" + i + "]:");
            height[i] = scan.nextInt();
        }

        System.out.println("최댓값은 " + exam2_3.MaxOfArray.maxOf(height));
    }
}
