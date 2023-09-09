package pro;



public class pro_120835 {
    public static void main(String[] args) {
        int[] emergency = {1, 2, 3, 4, 5, 6, 7};
        int[] b = emergency.clone();

        for(int i = 0; i < b.length - 1; i++){
            for(int j = i; j < b.length; j++){
                if(b[i] < b[j]){
                    int tmp = 0;
                    tmp = b[i];
                    b[i] = b[j];
                    b[j] = tmp;
                }
            }
        }

        int[] answer = new int[emergency.length];

        for(int i = 0; i < emergency.length; i++){
            for(int j = 0; j < emergency.length; j++){
                if(emergency[i] == b[j]){
                    answer[i] = j + 1;
                }
            }
        }

        for(int s : answer){
            System.out.print(s + " ");
        }
    }
}
