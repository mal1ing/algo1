package pro;

public class pro_120894 {
    public static void main(String[] args) {
        String numbers = "onefourzerosixseven";
        long answer = 0;

        numbers = numbers.replace("one", "1").replace("two", "2").replace("three", "3")
                .replace("four","4").replace("five", "5").replace("six", "6").replace("seven", "7")
                .replace("eight", "8").replace("nine", "9").replace("zero","0");

        answer = Long.parseLong(numbers);

        System.out.println(answer);
    }
}
