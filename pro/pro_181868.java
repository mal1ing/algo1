package pro;

public class pro_181868 {
    public static void main(String[] args) {
//        String my_string = "i  love you";
        String my_string = " programmars ";
        String[] words = my_string.trim().split("\\s+");
        String[] answer = new String[words.length];

        for(int i = 0; i < words.length; i++){
            answer[i] = words[i];
        }


        for(String s : answer){
            System.out.println(s);
        }
    }
}
