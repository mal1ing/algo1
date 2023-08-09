package pro;

public class pro_17681 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        //int[] nArr = {16, 8, 4, 2, 1};
        int[] nArr = new int[n];
        for(int i = 0; i < nArr.length; i++){
            nArr[i] = (int) Math.pow(2, n - 1 - i);
        }

        for(int i = 0; i < nArr.length; i++){
            System.out.println(nArr[i]);
        }

        String[] arr1Str = new String[n];

        String[] answer = new String[n];
        for(int i = 0; i < answer.length; i++){
            answer[i] = "";
        }


        for(int i = 0; i < arr1.length; i++){
            int cnt = 0;
            int sum = arr1[i];
            while (cnt != arr1.length){
                if(nArr[cnt] > sum){
                    arr1Str[cnt] = " ";
                    cnt++;
                } else if(nArr[cnt] <= sum) {
                    sum -= nArr[cnt];
                    arr1Str[cnt] = "#";
                    cnt++;
                }
            }

            int cnt2 = 0;
            int sum2 = arr2[i];
            while (cnt2 != arr1.length){
                if(nArr[cnt2] > sum2){
                    if(arr1Str[cnt2].equals("#")){
                        cnt2++;
                    } else {
                        cnt2++;
                    }
                } else if(nArr[cnt2] <= sum2) {
                    sum2 -= nArr[cnt2];
                    arr1Str[cnt2] = "#";
                    cnt2++;
                }
            }

            for(int j = 0; j < arr1Str.length; j++){
                answer[i] += arr1Str[j];
            }

        }

        for(String str : answer){
            System.out.println(str);
        }


    }
}
