package baek.javaTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Random;

public class List_Ex_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //1. id 중복 체크
        //아래와 같이 회원 가입된 id 목록이 주어진다.
        //["hagulu", "happy", "google", "bts", "iu", "cuteboy"]

//        ArrayList<String> idList = new ArrayList<>();
//        idList.add("hagulu");
//        idList.add("happy");
//        idList.add("google");
//        idList.add("bts");
//        idList.add("iu");
//        idList.add("cuteboy");
//
//        System.out.print("id : ");
//        String str = br.readLine();
//
//        if(idList.contains(str)){
//            System.out.println("중복입니다.");
//        } else {
//            System.out.println("사용가능합니다.");
//        }

        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(8);
        numList.add(7);
        numList.add(6);
        numList.add(10);
        numList.add(9);
        numList.add(4);
//
//        int min = 100;
//        int max = 0;
//        for(int i = 0; i < numList.size(); i++){
//            if(min > numList.get(i)){
//                min = numList.get(i);
//            }
//        }
//
//        for(int i = 0; i < numList.size(); i++) {
//            if(max < numList.get(i)){
//                max = numList.get(i);
//            }
//        }
//
//        for (int i = 0; i < numList.size(); i++){
//            if (numList.get(i) == max || numList.get(i) == min){
//                numList.remove(i);
//            }
//        }
//
//        int sum = 0;
//        for(int i = 0; i < numList.size(); i++){
//            sum += numList.get(i);
//        }
//
//        double res = sum / (double)numList.size();
//        System.out.println(res);

//        numList.sort(Comparator.naturalOrder());
//        System.out.println(numList);
//
//        numList.remove(0);
//        numList.remove(numList.size() - 1);
//        System.out.println(numList);
//
//        int sum = 0;
//        for(int num : numList){
//            sum += num;
//        }
//
//        System.out.println(sum / (double) numList.size());

        //3. 로또 번호
        //Random 클래스를 이용해서 1~45 범위의 6개의 중복 되지 않는 숫자를 리스트에 저장 하세요.
        //저장된 숫자를 오름 차순으로 정렬해서 출력 하세요.
        //출력 예시
        //
        //[3, 6, 19, 26, 37, 44]

//        List<Integer> lotto = new ArrayList<>();
//
//        Random rand = new Random();
//
//        for(int i = 0; i < 6; i++){
//            // 1 ~ 45
//            int randNum = rand.nextInt(45) + 1;
//
//            if(lotto.contains(randNum)){
//                i--;
//                continue;
//            }
//
//            lotto.add(randNum);
//        }
//
//        lotto.sort(Comparator.naturalOrder());
//
//        System.out.println(lotto);

        //4. 회원 추가하기
        //회원관리 리스트를 만든다.
        //
        //[우솝, 루피, 상디, 나미, 로빈]
        //새로 입력할 이름을 기존 리스트에 추가한다.
        //만약 동명이인이 있을 경우 회원명 뒤에 숫자를 붙인다.
        //(새로 입력할 이름들을 다른 리스트에 넣어두고 시작하기)

        ArrayList<String> memberList = new ArrayList<>();
        memberList.add("우솝");
        memberList.add("루피");
        memberList.add("상디");
        memberList.add("나미");
        memberList.add("로빈");

        ArrayList<String> newMemberList = new ArrayList<>();
        newMemberList.add("프랑키");
        newMemberList.add("루피");
        newMemberList.add("쵸파");
        newMemberList.add("로빈");
        newMemberList.add("루피");

        for(int i = 0; i < newMemberList.size(); i++){
            String newMem = newMemberList.get(i);
            int cnt = 1;
            while (memberList.contains(newMem)){
                newMem = newMemberList.get(i) + cnt;
                cnt++;
            }
            memberList.add(newMem);
        }
        

        System.out.println(memberList);



    }
}
