package pro;

public class pro_120902 {
    public static void main(String[] args) {
        String my_string = "3 + 4 - 5 + 5";

        String[] strArr = my_string.split(" ");
        int num = 0;
        int length = 0;

        for(int i = 1; i < strArr.length; i+= 2){
            if(i == 1){
                if(strArr[1].equals("+")){
                    num = Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[2]);
                } else if(strArr[i].equals("-")){
                    num = Integer.parseInt(strArr[0]) - Integer.parseInt(strArr[2]);
                }
            } else {
                if(strArr[i].equals("+")){
                    num = num + Integer.parseInt(strArr[i + 1]);
                } else if(strArr[i].equals("-")){
                    num = num - Integer.parseInt(strArr[i + 1]);
                }
            }
        }

        System.out.println(num);
    }
}
