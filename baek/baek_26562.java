package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class baek_26562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int num1 = Integer.parseInt(br.readLine());


        for(int i = 0; i < num1; i++){
            String pre = br.readLine();
            String[] preArr = pre.split(" ");

            System.out.println(dollor(preArr));
        }

    }
    private static String dollor(String[] name){
        int dollor = 0;
        for(int i = 0; i < name.length; i++){
            if(name[i].equals("Franklin")){
                dollor += 100;
            } else if(name[i].equals("Grant")){
                dollor += 50;
            } else if(name[i].equals("Jackson")){
                dollor += 20;
            } else if(name[i].equals("Hamilton")){
                dollor += 10;
            } else if(name[i].equals("Lincoln")){
                dollor += 5;
            } else if(name[i].equals("Washington")){
                dollor += 1;
            }
        }

        String res = "$" + String.valueOf(dollor);

        return res;
    }
}


