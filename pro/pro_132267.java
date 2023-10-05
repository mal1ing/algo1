package pro;

public class pro_132267 {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int c = 20;

        int answer = 0;

        while (true){
            if(c < a){
                break;
            }

            answer += (c / a) * b;
            int re = c % a;

            c = (c / a) * b + re;

        }

        System.out.println(answer);
    }
}
