package pro;

public class pro_120887 {
    public static void main(String[] args) {
        int i = 3;
        int j = 10;
        int k = 2;
        String kStr = String.valueOf(k);

        int tmp = 0;
        for(int num = i; num <= j; num++){
            String numStr = String.valueOf(num);

            String[] numStrArr = numStr.split("");
            for(int m = 0; m < numStrArr.length; m++){
                if(numStrArr[m].equals(kStr)){
                    tmp++;
                }
            }
        }

        System.out.println(tmp);
    }
}
