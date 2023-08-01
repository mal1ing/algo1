package baek;

import java.util.Scanner;

public class baek_3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] chess = new int[]{1,1,2,2,2,8};
        int[] res = new int[chess.length];
        for(int i = 0 ; i < chess.length; i++){
            int num = sc.nextInt();
            res[i] = chess[i] - num;
        }


        for(int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
