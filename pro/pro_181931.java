package pro;

public class pro_181931 {
    public static void main(String[] args) {
        int a = 3;
        int d = 4;
        boolean[] included = {true, false, false, true, true};

        int sum = 0;
        int tmp = 0;
        for(int i = 0; i < included.length; i++){
            if(i == 0){
                tmp += a;
                if(included[i] == true){
                    sum += tmp;
                }
            } else {
                tmp += d;
                if(included[i] == true){
                    sum += tmp;
                }
            }
        }

        System.out.println(sum);

    }
}
