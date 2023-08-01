package programmars;

public class pro5_25 {
    public static void main(String[] args) {
        int hp = 999;
        int getAtk = 5;
        int solAtk = 3;
        int worAtk = 1;
        int res = 0;

        for(int i = 0; ; i++){
            if(hp == 0 ){
                break;
            } if(hp >= getAtk) {
                hp = hp - getAtk;
                res++;
            } else if(hp >= solAtk){
                hp = hp - solAtk;
                res++;
            } else if(hp >= worAtk){
                hp = hp - worAtk;
                res++;
            }


        }
        System.out.println(res);

    }
}
