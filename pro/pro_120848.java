package pro;

public class pro_120848 {
    public static void main(String[] args) {
        int n = 3628800;

        int tmp = 1;
        for(int i = 0; ; i++){


            int sum = 1;
            for(int j = 1; j <= tmp; j++){
                sum *= j;
            }

            if(sum > n){
                break;
            } else {
                tmp++;
            }
        }

        System.out.println(tmp - 1);





    }
}
