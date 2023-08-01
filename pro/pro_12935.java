package pro;

public class pro_12935 {
    public static void main(String[] args) {
        int[] arr = {10};


        String str = "";


        for(int i = 0; i < arr.length; i++){
            str += String.valueOf(arr[i]) + " ";
        }

        String[] strArr = str.split(" ");
        int min = 1000;
        for(int i = 0; i < strArr.length; i++){
            if(Integer.parseInt(strArr[i]) < min){
                min = Integer.parseInt(strArr[i]);
            }
        }

        for(int i = 0; i < strArr.length; i++){
            if(strArr[i].equals(String.valueOf(min))){
                strArr[i] = " ";
            }
        }

        String str2 = "";
        if(strArr.length > 2){
            for(int i = 0; i < strArr.length; i++){
                str2 += strArr[i] + " ";
            }
        } else {
            str2 = "-1";
        }

        String[] str2Arr = str2.split(" ");
        int[] answer = new int[str2Arr.length];
        for(int i = 0; i < str2Arr.length; i++){
            answer[i] = Integer.parseInt(str2Arr[i]);
        }

        for(int i = 0; i < answer.length; i++){
            System.out.print(answer[i] + " ");
        }




    }
}
