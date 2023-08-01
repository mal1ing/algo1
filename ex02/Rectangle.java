package ex02;

public class Rectangle {

    int width;
    int height;


    // 넓이 구하기 가능
    // 멤버함수, 메소드
    int calculateArea() {
        int result = width * height;
        return result;
    }

    // 개수에 따른 넓이 구하는 기능
    // 같은 이름의 메소드를 만들 수 있다.
    // 조건 : 파라미터 개수가 다르다. 파라미터 타입이 다르다.
    // Overloading (오버로딩)
    int calculateArea(int count) {
        int result = width * height * count;
        return result;
    }

    // 멤버 변수의 값들을 출력하는 기능
    void printInfo() {
        System.out.println("가로길이 : " + width + " 세로 길이 : " + height);
    }
}
