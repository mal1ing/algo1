package baek;

import java.util.Scanner;

public class baek_2975 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for(int i = 0; ; i++){
            int num1 = sc.nextInt();
            String str = sc.next();
            int num2 = sc.nextInt();
            if(num1 == 0 && str.equals("W") && num2 == 0){
                break;
            }

            if(str.equals("W")){
                if(num1 - num2 >= -200){
                    sum = num1 - num2;
                    System.out.println(sum);
                } else {
                    System.out.println("Not allowed");
                }
            }  else if(str.equals("D")){
                sum = num1 + num2;
                System.out.println(sum);
            }


        }
    }
}
