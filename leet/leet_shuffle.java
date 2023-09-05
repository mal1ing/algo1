package leet;

public class leet_shuffle {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2};

        int n = 2;

        int[] answer = new int[nums.length];

        int tmp = 0;
        for(int i = 0; i < nums.length / 2; i++){
            answer[tmp] = nums[i];
            tmp++;
            answer[tmp] = nums[i + n];
            tmp++;
        }

        for(int s : answer){
            System.out.print(s + " ");
        }
    }
}
