package chap2.test;
// 키뿐만이 아니라 사람수도 난수로 생성하도록 실습 2-4를 수정하여 프로그램을 자성하시오

import java.util.Random;
import java.util.Scanner;

public class test1 {

    class MaxOfArrayRand {
        // 배열 a의 최댓값을 구하여 반환
        static int maxOf(int[] a) {
            int max = a[0];
            for(int i = 1; i < a.length; i++) {
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

        int num = rand.nextInt(90);
        System.out.print("사람 수: " + num + "명");

        int[] height = new int[num];

        System.out.println();

        System.out.println("킷값은 아래와 같습니다.");
        for(int i = 0; i < num; i++) {
            height[i] = 100 + rand.nextInt(90);
            System.out.println("height[" + i + "]: " + height[i]);
        }

        System.out.println("최댓값은 " + test1.MaxOfArrayRand.maxOf(height) + " 입니다." );
    }
}
