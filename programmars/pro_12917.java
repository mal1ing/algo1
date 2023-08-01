package programmars;

public class pro_12917 {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        char[] sArr = s.toCharArray();

        for(int i = 0; i < sArr.length - 1; i++){
            for(int j = i; j < sArr.length; j++){
                if(sArr[i] < sArr[j]){
                    int tmp = 0;
                    tmp = sArr[i];
                    sArr[i] = sArr[j];
                    sArr[j] = (char) tmp;
                }
            }
        }

        String answer = "";
        for(int i = 0; i < sArr.length; i++){
            answer += sArr[i];
        }




        System.out.println(answer);
    }
}
