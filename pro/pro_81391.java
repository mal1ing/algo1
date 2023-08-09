package pro;

public class pro_81391 {
    public static void main(String[] args) {
        String s = "one4seveneight";
        String[] numStr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] num = {"0","1", "2", "3", "4", "5", "6", "7", "8", "9" };

        for(int i = 0; i < num.length; i++){
            s = s.replace(numStr[i], num[i]);
        }

        System.out.println(s);
    }
}
