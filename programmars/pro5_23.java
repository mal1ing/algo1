package programmars;

public class pro5_23 {
    public static void main(String[] args) {
        String my_string = "banana";
        String is_suffix = "ana";
        int answer = 0;
        String[] myArr = new String[my_string.length()];
        String[] stringArr = my_string.split("");
        for(int i = 0; i < myArr.length; i++){
            myArr[i] = "";
        }

        for(int i = 0; i < myArr.length; i++){
            for(int j = i; j < stringArr.length; j++){
                myArr[i] += stringArr[j];
            }
        }

        for(int i = 0; i < myArr.length; i++){
            System.out.println(myArr[i]);
        }

    }
}
