package baek;

import java.util.Scanner;

public class baek_3058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int nums[] = new int[7];
        for(int i = 0; i < num1; i++){
            int sumEven = 0;
            int Even = 100;
            for(int j = 0; j < 7; j++){
                nums[j] = sc.nextInt();
                if(nums[j] % 2 == 0){
                    sumEven += nums[j];
                    if(nums[j] < Even){
                        Even = nums[j];
                    }
                }
            }

            System.out.println(sumEven + " " + Even);
        }
    }
}
