package pro;

public class pro_68935 {
    public static void main(String[] args) {
        int n = 45;
        int answer = 0;

        String tri_n = "";

        while (n > 0){
            tri_n += String.valueOf(n % 3);
            n = n / 3;
        }


        String[] tri_nArr = tri_n.split("");

        for(int i = 0; i < tri_nArr.length; i++){
            answer += Math.pow(3, tri_nArr.length - 1 - i) * Integer.parseInt(tri_nArr[i]);
        }

        System.out.println(answer);
    }
}
