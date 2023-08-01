package chap2.test;

import java.util.Scanner;

public class test4 {
    static void copy(int[] a, int[] b){
        int num = a.length <= b.length ?  a.length : b.length;
        for (int i = 0; i < num; i++) {
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("a의 요솟수는 : ");
        int numA = scan.nextInt();  // 요솟수
        int[] a = new int[numA];    // 요솟수가  numA인 배열
        for(int i = 0; i < numA; i++) {
            System.out.println("a[" + i + "] :");
            a[i] = scan.nextInt();
        }

        System.out.print("b의 요솟수는 : ");
        int numB = scan.nextInt();      // 요솟수
        int[] b = new int[numB];        // 요솟수가 numB인 배열
        for(int i = 0; i < numB; i++){
            System.out.println("b[" + i + "] : ");
            b[i] = scan.nextInt();
        }

        copy(a, b);

        System.out.println("배열 b의 모든 요소를 배열 a에 copy 하였습니다.");
        for(int i = 0; i < numA; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }

    }


}
