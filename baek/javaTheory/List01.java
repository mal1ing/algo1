package baek.javaTheory;

import java.util.ArrayList;

public class List01 {
    public static void main(String[] args) {

        // 1. List 만들기
        //리스트에 주어진 값들을 넣고 출력하세요.
        //3, 8, 9, 4, 2, 1, 7, 5
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(3);
        numList.add(8);
        numList.add(9);
        numList.add(4);
        numList.add(2);
        numList.add(1);
        numList.add(7);
        numList.add(5);

        System.out.println(numList);

        //2. 값 수정하기
        //List의 네번째 값을 6으로 바꾸고 전체를 출력하세요.
        //출력 예시
        //
        //[3, 8, 9, 6, 2, 1, 7, 5]

        numList.set(3, 6);
        System.out.println(numList);

        //3. 값 삽입하기
        //List의 세번째 위치에 10을 삽입 하고 전체를 출력 하세요.
        //[3, 8, 10, 9, 6, 2, 1, 7, 5]

        numList.add(2, 10);
        System.out.println(numList);

        //4. 값 삭제하기
        //List에서 8과 7을 삭제하고 전체를 출력하세요.
        //출력 예시
        //[3, 10, 9, 6, 2, 1, 5]

        for(int i = 0; i < numList.size(); i++){
            if(numList.get(i) == 7 || numList.get(i) == 8){
                numList.remove(i);
            }
        }

        System.out.println(numList);


    }
}
