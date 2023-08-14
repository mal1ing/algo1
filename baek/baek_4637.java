package baek;

public class baek_4637 {
    public static void main(String[] args) {
        boolean[] check = new boolean[10001];

        for(int i = 0; i < 10001; i++){
            int num = d(i);

            if(num < 10001){
                check[num] = true;
            }
        }

        for(int i = 0; i < 10001; i++){
            if(!check[i]){
                System.out.println(i);
            }
        }
    }

    public static int d(int num){
        int sum = num;

        while (num != 0){
            sum = sum + (num % 10);
            num = num / 10;
        }

        return sum;
    }
}
