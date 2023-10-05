package pro;

public class pro_176963 {
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5 , 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        for(int i = 0; i < photo.length; i++){
            String[] inArr = photo[i];
            int sum = 0;
            for(int j = 0 ; j < inArr.length; j++){
                for(int k = 0; k < name.length; k++){
                    if(inArr[j].equals(name[k])){
                        sum += yearning[k];
                    }
                }
            }

            System.out.println(sum);
        }
    }
}
