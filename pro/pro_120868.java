package pro;

import java.util.Arrays;

public class pro_120868 {
    public static void main(String[] args) {
        int[] sides = {11,7};

        int answer = 0;
        Arrays.sort(sides);
        int side = sides[1];

        // side가 가장 클 때
        // 3보다는 크고 6보다 작거나 같게
        int tmp = 0;
        for(int i = sides[0] + 1; i <= sides[1]; i++){
            tmp++;
        }

        // 나머지 변이 가장 클 때
        // 3 + 6보다 작고 6보다는 클 때
        for(int i = sides[0] + sides[1] - 1; i > sides[1]; i--){
            tmp++;
        }

        System.out.println(tmp);

    }
}
