package pro;

public class pro_120843 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int k = 3;

        String kStr = "";
        for(int i = 0; i < k; i++){
            for(int j = 0; j < numbers.length; j++){
                kStr += String.valueOf(numbers[j]);
            }
        }
        String[] kStrArr = kStr.split("");
        int num1 = 0;
        int answer = 0;
        for(int i = 0; i < kStrArr.length; i += 2){
            num1 = Integer.parseInt(kStrArr[i]);
            answer++;
            if(answer == k){
                break;
            }
        }

        System.out.println(num1);
    }
}
