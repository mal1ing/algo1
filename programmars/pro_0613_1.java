package programmars;

public class pro_0613_1 {
    public static void main(String[] args) {
        int[] arr = new int[]{5,1,4};

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        int[] resArr = new int[sum];
        // 55555 1 4444
        // 04 45 59
        int tmp = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i]; j++){
                resArr[tmp] = arr[i];
                tmp++;
            }
        }

        for(int i = 0; i < resArr.length; i++){
            System.out.println(resArr[i]);
        }
    }
}
