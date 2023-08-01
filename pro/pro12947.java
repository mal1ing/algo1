package pro;

public class pro12947 {
    public static void main(String[] args) {
        boolean answer = true;
        int num1 = 13;
        String num1Str = String.valueOf(num1);
        String[] num1StrArr = num1Str.split("");

        int sum = 0;
        for(int i = 0; i < num1StrArr.length; i++){
            sum += Integer.parseInt(num1StrArr[i]);
        }

        if(num1 % sum == 0){
            answer = true;
        } else {
            answer = false;
        }

        System.out.println(answer);
    }
}
