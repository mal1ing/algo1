package pro;

public class pro_12940 {
    public static void main(String[] args) {
        int n = 2;
        int m = 5;
        int[] answer = {};
        int min = gdc(n, m);
        int max = (n * m) / gdc(n, m);

        answer[0] = min;
        answer[1] = max;
        System.out.println(answer[0] + answer[1]);
    }

    public static int gdc(int n, int m) {
        if(m == 0){
            return n;
        }

        return gdc(m, n % m);
    }

}
