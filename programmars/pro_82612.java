package programmars;

public class pro_82612 {
    public static void main(String[] args) {
        int price = 3;
        int money = 20;
        int count = 4;
        long answer = 0;
        int sum = 0;

        for(int i = 1; i <= count; i++){
            sum += (i * price);
        }
        if(sum > money){
            answer = sum - money;
        } else {
            answer = 0;
        }


        System.out.println(answer);
    }
}
