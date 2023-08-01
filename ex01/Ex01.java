package ex01;

public class Ex01 {
    public static void main(String[] args) {

        // 객체 생성
        ScoreData scoreData = new ScoreData();

        // 속성 값 생성
        scoreData.name = "국어";
        scoreData.score = 80;
        scoreData.ranking = 10;

        // 필드값 출력
        System.out.println(scoreData.name);
        System.out.println(scoreData.score);
        System.out.println(scoreData.ranking);
    }
}
