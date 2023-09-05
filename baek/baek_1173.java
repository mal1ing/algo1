package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_1173 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 순서 N m M T R
        // T : 운동했을때 추가되는 맥박
        // X : 그냥 맥박
        // R: 휴식할 떄 감소하는 맥박
        // M: 최대 맥박 넘을 수 없음(이하만 가능)
        // m : 최소 맥박(초기 맥박)
        // N : 운동할 시간

        String str = br.readLine();
        String[] strArr = str.split(" ");

        int[] numArr = new int[strArr.length];
        for(int i = 0; i < strArr.length; i++){
            numArr[i] = Integer.parseInt(strArr[i]);
        }

        int res = 0;
        int move = 0;
        int temp = numArr[1];

        while (move != numArr[0]){
            res++;

            if(numArr[1] + numArr[3] <= numArr[2]){
                numArr[1] += numArr[3];
                move++;
            } else {
                numArr[1] -= numArr[4];

                if(numArr[1] < temp){
                    numArr[1] = temp;
                }
            }

            if((numArr[1] + numArr[3] > numArr[2]) && (numArr[1] == temp)){
                break;
            }
        }

        if(move != numArr[0]){
            System.out.println(-1);
        } else {
            System.out.println(res);
        }



    }
}
