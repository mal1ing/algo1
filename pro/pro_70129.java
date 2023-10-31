package pro;

public class pro_70129 {
    public static void main(String[] args) {
        String s = "1111111";
        int num = 0;

        int cycleCnt = 0;
        int removeZero = 0;

        while (true){
            int originalsLength = s.length();
            s = s.replaceAll("0","");
            int sLength = s.length();
            removeZero += originalsLength - sLength;
            String sBinary = Integer.toBinaryString(sLength);
            s = sBinary;
            cycleCnt++;
            if(s.equals("1")){
                break;
            }
        }
        System.out.println(cycleCnt + " " + removeZero);

    }
}
