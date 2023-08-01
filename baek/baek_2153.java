package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_2153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] alp = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u",
                        "v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P",
                        "Q","R","S","T","U","V","W","X","Y","Z"};
        int[] alpNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18 , 19,
                20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41 , 42, 43, 44, 45, 46,47,48,49, 50,51,52};
        String str = br.readLine();
        String[] strArr = str.split("");
        int sum = 0;
        for(int i = 0; i < strArr.length; i++){
            for(int j = 0; j < alp.length; j++){
                if(strArr[i].equals(alp[j])){
                    sum += alpNum[j];
                }
            }
        }

        int sosu = 0;
        for(int i = 1; i <= sum; i++){
            if(sum % i == 0){
                sosu++;
            }
        }

        if(sosu == 1 || sosu == 2){
            System.out.println("It is a prime word.");
        } else {
            System.out.println("It is not a prime word.");
        }
    }
}
