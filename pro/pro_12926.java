package pro;

public class pro_12926 {
    public static void main(String[] args) {
        String s = "z";
        int n = 1;
        String answer = "";

       for(int i = 0; i < s.length(); i++){
           char ch = s.charAt(i);
           if(ch == ' '){
               answer += ch;
               continue;
           }

           if(ch >= 'a' &&  ch <= 'z'){
               if(ch + n > 'z'){
                   answer += (char)(ch - 26 + n);
               } else {
                   answer += (char)(ch + n);
               }
           } else if(ch >= 'A' && ch <= 'Z'){
               if(ch + n > 'Z'){
                   answer += (char)(ch - 26 + n);
               } else {
                   answer += (char)(ch + n);
               }
           }
       }

        System.out.println(answer);


    }
}
