package pro;

public class pro_12924 {
    public static void main(String[] args) {
        int n = 15;

        int tmp = 0;
        int cnt = 0;

        for(int i = 1; i <= n; i++){

            for(int j = i; ; j++){
                tmp += j;
                if(tmp == n){
                    cnt++;
                    tmp = 0;
                    break;
                } else if(tmp > n){
                    tmp = 0;
                    break;
                }
            }
        }

        System.out.println(cnt);
    }
}
