package pro;

public class pro_12910 {
    public static void main(String[] args) {
//        int[] arr = {5, 9, 7, 10};
//        int divisor = 5;
        int[] arr = {2, 36 ,1, 3};
        int divisor = 1;

        int tmp = 0;
        int noDiv = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                tmp++;
            } else {
                noDiv++;
            }
        }


        if(noDiv == arr.length){
            tmp = 1;
        }

        int[] answer = new int[tmp];

        int tmp2 = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                answer[tmp2] = arr[i];
                tmp2++;
            }
        }
        if(tmp2 == 0){
            answer[0] = -1;
        }

        for(int i = 0; i < answer.length - 1; i++){
            for(int j = i; j < answer.length; j++){
                if(answer[i] > answer[j]){
                    int tmp3 = 0;
                    tmp3 = answer[i];
                    answer[i] = answer[j];
                    answer[j] = tmp3;
                }
            }
        }

        for(int i = 0; i < answer.length; i++){
            System.out.print(answer[i] + " ");
        }
    }
}
