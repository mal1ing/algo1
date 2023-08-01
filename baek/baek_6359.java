package baek;

import java.util.Scanner;

public class baek_6359 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

        for(int i = 0; i < num1; i++){
            int num2 = sc.nextInt();
            boolean[] gan = new boolean[num2 + 1];

            for(int k = 2; k <= num2; k++){
                for(int j = k; j <= num2; j += k){
                    gan[j] = !gan[j];
                }
            }

            int tmp = 0;
            for(int k = 1; k <= num2; k++){
                if(!gan[k]){
                    tmp++;
                }
            }

            System.out.println(tmp);

        }
    }
}
