package pro;

public class pro_12925 {
    public static void main(String[] args) {
        int answer = 1;
        String s = "1234";
        if((s.charAt(0) != '+') || (s.charAt(0) != '-')){
            s = "+" + s;
        }

        String[] sArr = s.split("");
        if(sArr[0].equals("+")){
            answer *= 1;
        } else if(sArr[0].equals("-1")){
            answer *= -1;
        }

        String sRes = "";
        for(int i = 1; i < sArr.length; i++){
            sRes += sArr[i];
        }

        answer = answer * Integer.parseInt(sRes);


        System.out.println(answer);
    }

}
