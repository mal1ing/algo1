package pro;

public class pro181888 {
    public static void main(String[] args) {
        int[] num_list = {4,2,6,1,7,6};
        int n = 4;
        String nStr = "";

        for(int i = 0; i < num_list.length; i += n){
            nStr += String.valueOf(num_list[i]) + " ";
        }

        String[] nStrArr = nStr.split(" ");
        int[] nStrInt = new int[nStrArr.length];
        for(int i = 0; i <nStrInt.length; i++){
            nStrInt[i] = Integer.parseInt(nStrArr[i]);
        }

        for(int ns : nStrInt){
            System.out.print(ns + " ");
        }
    }
}
