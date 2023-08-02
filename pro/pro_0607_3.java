package pro;

public class pro_0607_3 {
    public static void main(String[] args) {
        int n = 24;
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                sum++;
            }
        }

        int[] yakArr = new int[sum];
        int tmp = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                yakArr[tmp] = i;
                tmp++;
            }
        }

        for(int i = 0; i < yakArr.length; i++){
            System.out.println(yakArr[i]);
        }
    }
}
