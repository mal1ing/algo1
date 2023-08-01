package baek;


import java.util.Scanner;

public class baek_10824 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String answer = sc.nextLine();
        String[] answerArr = answer.split(" ");

        long res1 = Long.parseLong(answerArr[0] + answerArr[1]);
        long res2 = Long.parseLong(answerArr[2] + answerArr[3]);

        System.out.println(res1 + res2);

    }
}
