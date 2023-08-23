package pro;

public class pro_120888 {
    public static void main(String[] args) {
        String my_string = "We are the world";

        String[] strArr = my_string.split("");
        String str = "";
        for(int i = 0; i < strArr.length; i++){
            if(!str.contains(strArr[i])){
                str += strArr[i];
            }
        }

        System.out.println(str);
    }
}
