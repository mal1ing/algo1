package baek;

import java.io.IOException;
import java.util.Scanner;

public class baek_18245 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = 2;
        for(int i = 0; ; i++){
            String str = sc.nextLine();
            if(str.equals("Was it a cat I saw?")){
                break;
            }
            String[] strArr = str.split("");
            String rst = "";


            for(int j = 0; j < strArr.length; j += num){
                rst += strArr[j];
            }
            num++;

            System.out.println(rst);
        }
    }
}
