package pro;

import java.util.ArrayList;
import java.util.Stack;

public class pro_12906 {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        int[] answer = {};
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        int num1 = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != num1){
                arrayList.add(arr[i]);
                num1 = arr[i];
            }
        }

        answer = new int[arrayList.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arrayList.get(i);
        }


        System.out.println(arrayList);
    }
}
