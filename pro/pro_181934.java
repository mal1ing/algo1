package pro;

public class pro_181934 {
    public static void main(String[] args) {
        String ineq = ">";
        String eq  = "!";
        int n = 41;
        int m = 78;
        int answer = 0;
        if(ineq.equals("<") && eq.equals("=")){
            if(n <= m){
                answer = 1;
            } else {
                answer = 0;
            }
        } else if(ineq.equals("<") && eq.equals("!")){
            if(n < m){
                answer = 1;
            } else {
                answer = 0;
            }
        } else if(ineq.equals(">") && eq.equals("=")) {
            if (n >= m) {
                answer = 1;
            } else {
                answer = 0;
            }
        } else if(ineq.equals(">") && eq.equals("!")) {
            if (n > m) {
                answer = 1;
            } else {
                answer = 0;
            }
        }

        System.out.println(answer);
    }
}
