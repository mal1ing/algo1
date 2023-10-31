package pro;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class pro_120883 {
    public static void main(String[] args) {
        String[] id_pw = {"programmer01", "15789"};
        String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};

        Map<String, String> id_pw_map = new HashMap<>();

        for(int i = 0; i < db.length; i++){
            id_pw_map.put(db[i][0], db[i][1]);
        }
        try {
            if (id_pw_map.get(id_pw[0]).equals(id_pw[1])) {
                System.out.println("login");
            } else if (!id_pw_map.get(id_pw[0]).equals(id_pw[1])) {
                System.out.println("wrong pw");
            } else {
                System.out.println("fail");
            }
        } catch (Exception e){
            System.out.println("fail");
        }
    }
}
