package pro;

public class pro_120924 {
    public static void main(String[] args) {
        int[] common = {2,4,8};

        if((common[1] - common[0]) == (common[common.length - 1] - common[common.length - 2])){
            System.out.println(common[common.length - 1] + (common[1] - common[0]));
        } else {
            System.out.println(common[common.length - 1] * (common[1] / common[0]));
        }
    }
}
