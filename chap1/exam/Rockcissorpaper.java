package chap1.exam;

//scanner와 random함수를 이용하여 유저와 컴퓨터간의 가위바위보게임을 3경지 진행합니다.
//매경기 승패를 알려주시고 최종결과도 알려주세요

import java.util.Random;
import java.util.Scanner;

public class Rockcissorpaper {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int num = 1;
        int userCnt = 0;
        int comCnt = 0;
        int drawCnt = 0;

        do {
            System.out.println(num + "경기");
            System.out.println("가위 바위 보 중 선택해주세요: 1:가위, 2:바위, 3:보 ※다른 숫자는 입력할 수 없습니다.");
            System.out.print("숫자입력 :");
            int userChoice = scan.nextInt();
            int comChoice = rand.nextInt(3) + 1;
            for(int i = 0; ; i++){
                if(userChoice != 1 && userChoice != 2 && userChoice != 3){
                    System.out.print("다시입력해주세요: ");
                    userChoice = scan.nextInt();
                }
                else {
                    break;
                }
            }


//            유저가 가위를 내서 이기고 비기고 지고
//            유저가 바위를 내서 이기고 비기고 지고
//            유저가 보를 내서 이기고 비기고 지고
//           유저가 입력한 숫자 가위바위보로 변경
            String userRCP = "";
            if (userChoice == 1) {
                userRCP = "가위";
            }
            else if (userChoice == 2) {
                userRCP = "바위";
            }
            else if (userChoice == 3) {
                userRCP = "보";
            }

//            컴퓨터가 얻은 숫자 가위바위보로 변경
            String comRCP = "";
            if(comChoice == 1) {
                comRCP = "가위";
            }
            else if(comChoice == 2) {
                comRCP = "바위";
            }
            else if(comChoice == 3){
                comRCP = "보";
            }
            System.out.println("유저의 선택:" + userRCP);
            System.out.println("컴퓨터의 선택:" + comRCP);

//            가위바위보
//            유저가 가위를 내서 이기고 비기고 지고
//            유저가 바위를 내서 이기고 비기고 지고
//            유저가 보를 내서 이기고 비기고 지고

            if(userRCP.equals("가위")) {
                if(comRCP.equals("가위")){
                    System.out.println("비겼습니다!");
                    drawCnt++;
                }
                else if(comRCP.equals("바위")){
                    System.out.println("졌습니다!");
                    comCnt++;
                }
                else if(comRCP.equals("보")){
                    System.out.println("이겼습니다!");
                    userCnt++;
                }
            }
            else if(userRCP.equals("바위")) {
                if(comRCP.equals("가위")){
                    System.out.println("이겼습니다!");
                    userCnt++;
                }
                else if(comRCP.equals("바위")){
                    System.out.println("비겼습니다!");
                    drawCnt++;
                }
                else if(comRCP.equals("보")){
                    System.out.println("졌습니다!");
                    comCnt++;
                }
            }
            else if(userRCP.equals("보")) {
                if(comRCP.equals("가위")){
                    System.out.println("졌습니다!");
                    comCnt++;
                }
                else if(comRCP.equals("바위")){
                    System.out.println("이겼습니다!");
                    userCnt++;
                }
                else if(comRCP.equals("보")){
                    System.out.println("비겼습니다!");
                    drawCnt++;
                }
            }

        num++;


        } while(num <= 3);
        System.out.println("경기의 승자는 ?");
        System.out.println("유저승리:" + userCnt);
        System.out.println("컴퓨터승리:" + comCnt);
        System.out.println("비김:" + drawCnt);
        
        //userCnt가 가장 클 경우 유저 승리
        //comCnt가 가장 클 경우 컴 승리
        //drawCnt가 가장 클 경우 비김
//        경우의 수 300 201 210 120 102 111 
        if (userCnt > comCnt && userCnt > drawCnt){
            System.out.println("최종승자: 유저 승리");
        }
        else if (comCnt > userCnt && comCnt > drawCnt) {
            System.out.println("최종승자: 컴퓨터 승리");
        }
        else if((drawCnt > userCnt && drawCnt > comCnt) || (drawCnt == userCnt && drawCnt == comCnt)){
            System.out.println("최종승자: 비김");
        }



    }
}



