package pro;

public class pro_12940_2 {
    public static void main(String[] args) {
        int n = 3;
        int m = 12;
        int[] answer = new int[2];
        answer[0] = gdc(n,m);
        answer[1] = (n * m) / gdc(n,m);

        for(int i = 0; i < answer.length; i++){
            System.out.println(answer[i]);
        }

    }

    public static int gdc(int n, int m ){
        System.out.println("n : " + n + " m : " + m);
        if(m == 0){
            return n;
        }

        return gdc(m, n % m);
    }
}
