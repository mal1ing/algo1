package chap2.exam;

import java.util.Random;
import java.util.Scanner;

public class exam2_4 {

    class MaxOfArrayRand {
        //배열 a의 최댓값을 구하여 반환
        static int maxOf(int[] a) {
            int max = a[0];
            for(int i = 0; i < a.length; i++) {
                if(a[i] > max) {
                    max = a[i];
                }
            }
            return max;
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수 : ");
        int num = scan.nextInt();

        int[] height = new int[num];

        System.out.println("킷값은 아래와 같습니다.");
        for(int i = 0; i < num; i++) {
            height[i] = 100 + rand.nextInt(90);
            System.out.println("height[" + i + "]: " + height[i]);
        }
        System.out.println("최댓값은" + exam2_4.MaxOfArrayRand.maxOf(height) + " 입니다.");

    }
}
