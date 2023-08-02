package pro;

public class pro_0607_2 {
    public static void main(String[] args) {
        int n = 0;
        int mo = 6;
        int moY = 0;

        for(int i = 2; i <= mo; i++){
            if(mo % i == 0){
                moY++;
            }
        }

        int[] moYArr = new int[moY];
        int moYs = 0;
        for(int i = 2; i <= mo; i++){
            if(mo % i == 0){
                moYArr[moYs] = i;
                moYs++;
            }
        }


        // 10을 moYs로 나누기
        for(int i = 0; i < moYArr.length; i++){
            if(n % moYArr[i] == 0){
                n = n / moYArr[i];
            }
        }

        System.out.println(n);
    }
}
