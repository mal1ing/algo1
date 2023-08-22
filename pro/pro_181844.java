package pro;

import java.util.ArrayList;

public class pro_181844 {
    public static void main(String[] args) {
        int[] arr = {293, 1000, 295, 678, 94};
        int[] delete_list = {94, 777, 104, 1000, 1, 12};


        ArrayList<Integer> list = new ArrayList<>();


        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < delete_list.length; j++){
                if(arr[i] == delete_list[j]){
                    list.remove(Integer.valueOf(arr[i]));
                }
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0 ; i < answer.length; i++){
            answer[i] = list.get(i);
        }


        for(int n : answer){
            System.out.print(n + " ");
        }






    }
}
