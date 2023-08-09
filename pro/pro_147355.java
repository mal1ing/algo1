package pro;

public class pro_147355 {
    public static void main(String[] args) {
        String t = "500220839878";
        String p = "7";
        String tmp  = "";
        String tmp2 = "";
        int result = 0;
        String[] tArr = t.split("");
        int cnt = 0;
        for(int i = 0; i < tArr.length; i++){
            tmp += tArr[i];
            if(tmp.length() == p.length()){
                tmp2 += tmp + ",";
                i = tmp.length() - p.length() + cnt;
                cnt++;
                tmp = "";
            }
        }
        String[] tmp2Arr = tmp2.split(",");


        long pLong = Long.parseLong(p);
        for(int i = 0; i < tmp2Arr.length; i++){
            if(Long.parseLong(tmp2Arr[i]) <= pLong){
                result++;
            }
        }

        System.out.println(result);


    }
}
