package chap1.test;

public class exam02 {
    static int min3(int a, int b, int c){
        int min = a;
        if(b < min){
            min = b;
        }
        if(c < min){
            min = c;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(min3(3,2,1));
    }
}
