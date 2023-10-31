package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_5218 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String alp[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
//            "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
//        int alpInt[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
//
//        int num1 = Integer.parseInt(br.readLine());
//        for(int i = 0; i < num1; i++){
//            String str = br.readLine();
//            String[] strArr = str.split(" ");
//            String[] strArr1 = strArr[0].split("");
//            String[] strArr2 = strArr[1].split("");
//            for(int j = 0; j < strArr1.length; j++){
//                if()
//            }
//        }

        int num1 = Integer.parseInt(br.readLine());
        for(int i = 0; i < num1; i++){
            String str = br.readLine();
            String[] strArr = str.split(" ");
            String[] strArr1 = strArr[0].split("");
            String[] strArr2 = strArr[1].split("");

            String distances = "";

            for(int j = 0; j < strArr2.length; j++){
                String tmp = "";
                strArr1[j] = strArr1[j].replace("A", "1").replace("B", "2").replace("C", "3").replace("D","4").
                        replace("E", "5").replace("F","6").replace("G", "7").replace("H", "8").replace("I", "9")
                        .replace("J", "10").replace("K", "11").replace("L", "12").replace("M","13")
                        .replace("N","14").replace("O", "15").replace("P","16").replace("Q","17").replace("R","18")
                        .replace("S", "19").replace("T","20").replace("U","21").replace("V","22").replace("W","23")
                        .replace("X","24").replace("Y","25").replace("Z", "26");

                strArr2[j] = strArr2[j].replace("A", "1").replace("B", "2").replace("C", "3").replace("D","4").
                        replace("E", "5").replace("F","6").replace("G", "7").replace("H", "8").replace("I", "9")
                        .replace("J", "10").replace("K", "11").replace("L", "12").replace("M","13")
                        .replace("N","14").replace("O", "15").replace("P","16").replace("Q","17").replace("R","18")
                        .replace("S", "19").replace("T","20").replace("U","21").replace("V","22").replace("W","23")
                        .replace("X","24").replace("Y","25").replace("Z", "26");

                if(Integer.parseInt(strArr2[j]) - Integer.parseInt(strArr1[j]) >= 0){
                    tmp = String.valueOf(Integer.parseInt(strArr2[j]) - Integer.parseInt(strArr1[j])) + " ";
                } else {
                    tmp = String.valueOf((Integer.parseInt(strArr2[j]) + 26) - Integer.parseInt(strArr1[j])) + " ";
                }

                distances += tmp;

            }
            System.out.println("Distances: " + distances);



        }
    }
}
