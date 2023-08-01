package chap1.test;

public class test14 {

    static void triangleLB(int n ) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        triangleLB(4);
    }
}
