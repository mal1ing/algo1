package pro;

public class pro_77884 {
    public static void main(String[] args) {
        int left = 13;
        int right = 17;

        int answer = 0;

        // 약수의 개수가 짝수인건 + 약수의 홀수인건 -

        for(int i = left; i <= right; i++){
            int measure = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    measure++;
                }
            }
            if(measure % 2 == 0){
                answer += i;
            } else {
                answer -= i;
            }
        }

        System.out.println(answer);
    }
}
