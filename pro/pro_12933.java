package pro;

public class pro_12933 {
    public static void main(String[] args) {

        long n = 118372;
        String nStr = String.valueOf(n);
        String[] nStrArr = nStr.split("");

        for(int i = 0; i < nStrArr.length - 1; i++){
            for(int j = i; j < nStrArr.length; j++){
                if(Integer.parseInt(nStrArr[i]) < Integer.parseInt(nStrArr[j])) {
                    String tmp = "";
                    tmp = nStrArr[i];
                    nStrArr[i] = nStrArr[j];
                    nStrArr[j] = tmp;
                }
            }
        }

        String res = "";
        for(int i = 0; i < nStrArr.length; i++){
            res += nStrArr[i];
        }

        long answer = Long.parseLong(res);
    }
}
