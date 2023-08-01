package baek.javaTheory;

import java.util.ArrayList;
import java.util.Iterator;

public class ListEx02 {
    public static void main(String[] args) {

        //1. List 만들기
        //리스트에 주어진 값들을 넣으세요.
        //20 3 5 84 17

        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(20);
        numList.add(3);
        numList.add(5);
        numList.add(84);
        numList.add(17);

        //2. 최소값 구하기
        //List에서 가장 작은 값을 출력하세요.
        //for문을 사용하세요.(향상된 for문 X)
        //출력 예시: 3

        int min = 10000;
        for(int i = 0; i < numList.size(); i++){
            if(numList.get(i) < min){
                min = numList.get(i);
            }
        }
        System.out.println(min);

        //        3. 합계 구하기
        //List 요소들의 총 합계를 구하세요.
        //Iterator를 사용하세요.
        //출력 예시: 129

        Iterator<Integer> iter = numList.iterator();
        int sum = 0;
        while (iter.hasNext()){
            int num = iter.next();
            sum += num;
        }

        System.out.println(sum);

        //4. 리스트 삭제
        //List 에서 짝수 인 값을 모두 삭제하고 전체 값을 출력 하세요.
        //[3, 5, 17]

        for(int i = 0; i < numList.size(); i++){
            if(numList.get(i) % 2 == 0){
                numList.remove(i);
            }
        }
        System.out.println(numList);

    }
}
