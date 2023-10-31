package pro;

public class pro_120923 {
    public static void main(String[] args) {
        int num = 5;
        int total = 5;
        int[] answer = new int[num];

        for(int i = -1000000; ; i++){
            int  sum = 0;
            int tmp = 0;
            int[] answer2 = new int[num];
            for(int j = i; j < num + i; j++){
                sum += j;
                answer2[tmp] = j;
                tmp++;
            }
            if(sum == total){
                for(int j = 0; j < answer2.length; j++){
                    answer[j] = answer2[j];
                }
                break;
            }
        }

        for(int n : answer){
            System.out.print(n + " ");
        }
    }
}
