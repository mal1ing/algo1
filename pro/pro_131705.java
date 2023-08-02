package pro;

public class pro_131705 {
    public static void main(String[] args) {
        int[] number = {-3, -2, -1, 0, 1, 2 , 3};
        int cnt = 0;
        for(int i = 0; i < number.length - 2; i++){
            for(int j = i + 1; j < number.length - 1; j++){
                for(int k = j + 1; k < number.length; k++){
                    int sum = number[i] + number[j] + number[k];
                    if(sum == 0){
                        cnt++;
                    }
//                    System.out.println("i : " + i + " j : " + j + " k : " + k + " sum : " + sum);
                }
            }
        }
        System.out.println(cnt);
    }
}
