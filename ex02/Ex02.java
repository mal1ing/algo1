package ex02;

public class Ex02 {
    public static void main(String[] args) {

        // 직사각형을 객체화
        // 가로, 세로

        Rectangle bigRectangle = new Rectangle();
        bigRectangle.width = 35;
        bigRectangle.height = 47;

        int area = bigRectangle.calculateArea();
        System.out.println("큰 사각형 넓이 : " + area);

        Rectangle smallRectangle = new Rectangle();
        smallRectangle.width = 8;
        smallRectangle.height = 4;

        System.out.println("큰 사각형 : " + bigRectangle.calculateArea() + "작은 사각형 : " + smallRectangle.calculateArea());

        // 큰사각형 5개의 넓이
        System.out.println("큰 사각형 5개 넓이 " + bigRectangle.calculateArea(5));

        bigRectangle.printInfo();
        smallRectangle.printInfo();
    }
}
