package pro;

public class pro101277 {
    public static void main(String[] args) {
        int[] answer = new int[2];
        int[][] v = {{1,4},{3,4},{3,10}};


        int[] tmp1 = new int[3];
        int[] tmp2 = new int[3];

        for(int i = 0; i < tmp1.length; i++){
            tmp1[i] = v[i][0];
        }
        for(int i = 0; i < tmp2.length; i++){
            tmp2[i] = v[i][1];
        }

        int rst1 = 0;
        if(tmp1[1] == tmp1[0]){
            rst1 = tmp1[2];
        } else if(tmp1[1] == tmp1[2]){
            rst1 = tmp1[0];
        }

        int rst2 = 0;
        if(tmp2[1] == tmp2[0]){
            rst2 = tmp2[2];
        } else if(tmp2[1] == tmp2[2]){
            rst2 = tmp2[0];
        }

        answer[0] = rst1;
        answer[1] = rst2;


        
        for(int n : answer){
            System.out.print(n + " ");
        }














    }

}
