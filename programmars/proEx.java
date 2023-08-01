package programmars;


import java.util.Scanner;

public class proEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String my_string = "abcdef";
        String[] my_stringArr = my_string.split("");
        String letter = sc.next();
        String answer = "";
        for(int i = 0; i < my_stringArr.length; i++){
            if(!my_stringArr[i].equals(letter)){
                answer += my_stringArr[i];
            }
        }

        System.out.println(answer);









    }
}
