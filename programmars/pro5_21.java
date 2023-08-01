package programmars;

import java.util.Arrays;

public class pro5_21 {
    public static void main(String[] args) {
        int price = 987621;
        int answer = 0;
        if(price >= 500000){
            answer = price - (int)(price * 0.2);
            answer /= 10;
            answer *= 10;
        } else if(price >= 300000){
            answer = price - (int)(price * 0.1);
            answer /= 10;
            answer *= 10;
        } else if(price >= 100000){
            answer = price - (int)(price * 0.05);
            answer /= 10;
            answer *= 10;
        }

        System.out.println(answer);
    }
}
