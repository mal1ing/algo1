package pro;

public class pro_181891 {
    public static void main(String[] args) {
//        int[] num_list = {2, 1, 6};
        int[] num_list = {5, 2, 1, 7, 5};

        int[] result = new int[num_list.length];
        int n = 3;

        int tmp = 0;
        for(int i = n; i < num_list.length; i++){
            result[tmp] = num_list[i];
            tmp++;
        }

        for(int i = 0; i < n; i++){
            result[tmp] = num_list[i];
            tmp++;
        }

        for(int num : result){
            System.out.print(num + " ");
        }

    }
}
