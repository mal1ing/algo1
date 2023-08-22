package pro;

public class pro_120844 {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3};
        int[] numbers = {4, 455, 6, 4,-1, 45, 6};
        int[] result = new int[numbers.length];
        String direction = "left";

        if(direction.equals("right")){
            result[0] = numbers[numbers.length - 1];
            int tmp = 1;
            for(int i = 0; i < numbers.length - 1; i++){
                result[tmp] = numbers[i];
                tmp++;
            }
        } else if(direction.equals("left")){
            int tmp = 0;
            for(int i = 1; i < numbers.length; i++){
                result[tmp] = numbers[i];
                tmp++;
            }
            result[tmp] = numbers[0];
        }


        for(int n : result){
            System.out.print(n + " ");
        }
    }
}
