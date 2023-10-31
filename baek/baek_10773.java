package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class baek_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        int[] num1Arr = new int[num1];
        ArrayList<Integer> numArr = new ArrayList<>();

        for(int i = 0; i < num1; i++){
            num1Arr[i] = Integer.parseInt(br.readLine());
        }
//        for(int n : num1Arr){
//            System.out.print(n + " ");
//        }
//        System.out.println();


        int tmp = 0;
        // 0이 아니면 i수를 add 0이면 i수를 remove
        for(int i = 0; i < num1; i++){
            int num = num1Arr[i];
            if(num1Arr[i] != 0){
                numArr.add(num);
                //System.out.println(numArr);
                tmp++;
            } else if(num1Arr[i] == 0){
                numArr.remove(tmp - 1);
               // System.out.println(numArr);
                tmp--;
            }
        }

        int sum = 0;
        for(int i = 0; i < numArr.size(); i++){
            sum += numArr.get(i);
        }

        System.out.println(sum);
    }
}
//10
//        1
//        3
//        5
//        4
//        0
//        0
//        7
//        0
//        0
//        6