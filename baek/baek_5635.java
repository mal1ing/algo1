package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.time.LocalDate;

public class baek_5635 {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        String[] data = new String[num1];

        for(int i = 0; i < num1; i++){
            data[i] = br.readLine();
        }
        // 데이터를 가져오는 일 부터 해보자
        int year = 1;
        int month = 1;
        int day = 1;
        LocalDate date1 = LocalDate.of(year,month,day);


        int yearMin = 10000;
        int monthMin = 1;
        int dayMin = 1;
        String nameMin = "";
        LocalDate dateMin = LocalDate.of(yearMin,monthMin, dayMin);
//        System.out.println(date1);

        String name = "";

        for(int i = 0; i < num1; i++){
            String[] datas = data[i].split(" ");

            int year2 = Integer.parseInt(datas[3]);
            int month2 = Integer.parseInt(datas[2]);
            int day2 = Integer.parseInt(datas[1]);

            String name2 = datas[0];

            LocalDate date2 = LocalDate.of(year2,month2,day2);
//            System.out.println(date2);
//            System.out.println("com: " + date2.compareTo(date1));
            if (date2.compareTo(date1) > 1) {
                date1 = date2;
                name = name2;
            }
            if (date2.compareTo(dateMin) < 0){
                dateMin = date2;
                nameMin = name2;
            }

        }
        System.out.println(name);
        System.out.println(nameMin);
    }
}