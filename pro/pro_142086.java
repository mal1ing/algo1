package pro;

public class pro_142086 {
    public static void main(String[] args) {
        String s = "foobar";
        int[] answer = new int[s.length()];
        String[] sArr = s.split("");

        for(int i = 0; i < sArr.length; i++){
            int tmp = 0;
            int cnt = 0;
            int rst = 0;
            for(int j = i; j >= 0; j--){
                if(sArr[i].equals(sArr[j])){
                    tmp++;
                    if(tmp == 2) {
                        rst = cnt;
                    }
                }
                if(cnt == i){
                    if(tmp < 2){
                        answer[i] = -1;
                    } else {
                        answer[i] = rst;
                    }
                }
                cnt++;


            }
        }

        for(int n : answer){
            System.out.print(n + " ");
        }

    }
}
