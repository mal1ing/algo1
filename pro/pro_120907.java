package pro;

public class pro_120907 {
    public static void main(String[] args) {
        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
        String[] answer = new String[quiz.length];

        for(int i = 0; i < quiz.length; i++){
            String[] tmp  = quiz[i].split(" ");
            String OX = "";
            int ox = 0;
            if(tmp[1].equals("+")){
                ox  = Integer.parseInt(tmp[0]) + Integer.parseInt(tmp[2]);
            } else if(tmp[1].equals("-")){
                ox = Integer.parseInt(tmp[0]) - Integer.parseInt(tmp[2]);
            }

            if(ox == Integer.parseInt(tmp[4])){
                OX = "O";
            } else {
                OX = "X";
            }

            answer[i] = OX;
        }

        for(String s : answer){
            System.out.print(s + " ");
        }
    }
}
