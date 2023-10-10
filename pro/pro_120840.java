package pro;

import java.math.BigInteger;

public class pro_120840 {
    public static void main(String[] args) {
        int balls = 3;
        int share =2;

        int answer = 0;



    }
    public int combi(int balls, int share){
        if(share == 0 || balls == share){
            return 1;
        } else {
            return combi(balls - 1, share - 1) + combi(balls - 1, share);
        }
    }



}
