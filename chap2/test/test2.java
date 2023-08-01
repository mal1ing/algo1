package chap2.test;

import java.util.Arrays;
import java.util.Scanner;

public class test2 {

    class ReverseArray {
        //배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
        static void swap(int[] a, int idx1, int idx2) {
            int t = a[idx1];
            a[idx1] = a[idx2];
            a[idx2] = t;
        }
        //배열 a의 요소를 역순으로 정렬
        static void reverse(int[] a) {
            for(int i = 0; i < a.length / 2; i++){
                System.out.println("[" + Arrays.toString(a) + "]");
                System.out.println("a[" + i + "]과" + "a[" + (a.length - i - 1) + "]을 교환합니다.");
                swap(a, i, a.length - i - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("요솟수: ");

        // 요솟수
        int num = scan.nextInt();

        // 요솟수가 num인 배열
        int[] x=  new int[num];

        for(int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = scan.nextInt();
        }

        test2.ReverseArray.reverse(x);
        System.out.println(Arrays.toString(x));
        System.out.println("이상 역순 정렬을 마쳤습니다.");


    }

}
