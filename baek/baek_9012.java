package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class baek_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());



        for(int i = 0; i < num1; i++){
            System.out.println(stack(br.readLine()));
        }

    }

    public static String stack(String str){
        String[] strArr = str.split("");

        Stack<String> stack = new Stack<>();

        for(int i = 0; i < strArr.length; i++){
            if(strArr[i].equals("(")){
                stack.push(strArr[i]);
            }

            else if(stack.empty()){
                return "NO";
            }

            else {
                stack.pop();
            }
        }

        if(stack.empty()){
            return "YES";
        } else {
            return "NO";
        }
    }
}
