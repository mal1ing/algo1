package pro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class pro_120838 {
    public static void main(String[] args) {
        String letter = ".... . .-.. .-.. ---";
        HashMap<String, String> moose = new HashMap<>();
        moose.put(".-", "a");
        moose.put("-...", "b");
        moose.put("-.-.", "c");
        moose.put("-..", "d");
        moose.put(".", "e");
        moose.put("..-.", "f");
        moose.put("--.", "g");
        moose.put("....", "h");
        moose.put("..", "i");
        moose.put(".---", "j");
        moose.put("-.-", "k");
        moose.put(".-..", "l");
        moose.put("--", "m");
        moose.put("-.", "n");
        moose.put("---", "o");
        moose.put(".--.", "p");
        moose.put("--.-", "q");
        moose.put(".-.", "r");
        moose.put("...", "s");
        moose.put("-", "t");
        moose.put("..-", "u");
        moose.put("...-", "v");
        moose.put(".--", "w");
        moose.put("-..-", "x");
        moose.put("-.--", "y");
        moose.put("--..", "z");

        String[] letterArr = letter.split(" ");
        String answer = "";

        for(int i = 0; i < letterArr.length; i++){
            answer += moose.get(letterArr[i]);
        }

        System.out.println(answer);
    }
}
