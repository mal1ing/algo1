package pro;

public class pro_0608_1 {
    public static void main(String[] args) {
        int order = 29423;
        String orderStr = String.valueOf(order);
        String[] orderStrArr = orderStr.split("");
        int tmp = 0;
        for(int i = 0; i < orderStrArr.length; i++){
            if(orderStrArr[i].equals("3") || orderStrArr[i].equals("6") || orderStrArr[i].equals("9")){
                tmp++;
            }
        }

        System.out.println(tmp);
    }
}
