package pro;

public class pro_120913 {
    public static void main(String[] args) {
        String my_str = "abc1Addfggg4556b";
        int n = 6;

        int cnt = (my_str.length() + n - 1) / n;
        String[] answer = new String[cnt];

        for(int i = 0; i < cnt; i++){
            int start = n * i;
            int end = 0;
            if(start + n >= my_str.length()){
                end = my_str.length();
            } else {
                end = start + n;
            }
            answer[i] = my_str.substring(start, end);
        }

        for(String s : answer){
            System.out.print(s + " ");
        }
    }
}
