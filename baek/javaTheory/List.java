package baek.javaTheory;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {


        //리스트
        // 같은 타입의 여러개의 데이터를 저장
        // 순서가 있음

        int[] numbers = new int[5];
        ArrayList<Integer> integerList = new ArrayList<>();
        // 값 추가
        integerList.add(25);
        integerList.add(10);

        System.out.println(integerList);

        // 값 삽입
        integerList.add(1, 20);
        System.out.println(integerList);

        // 값 얻기
        // numbers[4]
        Integer number = integerList.get(2);

        System.out.println(number);
    }
}
