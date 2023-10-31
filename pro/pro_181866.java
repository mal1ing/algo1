package pro;

import java.util.Arrays;

public class pro_181866 {
    public static void main(String[] args) {
        String myString = "xxxxaxbxcx";
        String xString = myString.replaceAll("x"," ");
        xString = xString.replaceAll("\\s+", "_");
        xString = xString.replaceAll("_", " ");
        xString = xString.trim();
        String[] xArr = xString.split(" ");
        Arrays.sort(xArr);

        for(String n : xArr){
            System.out.println(n + " ");
        }
    }
}
