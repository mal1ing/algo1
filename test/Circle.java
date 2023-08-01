package test;

public class Circle {
    double r;

    double CircleArea(){
        double result = r * r * 3.14;
        return  result;
    }

    double CircleAround(){
        double result = 2 * 3.14 * r;
        return result;
    }

    double CircleAreaMany(int count){
        double result = r * r * 3.14 * count;
        return result;
    }


}
