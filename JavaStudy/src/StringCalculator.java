
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    
    // 덧셈을 한다.
    public int add(String input){

        if(isBlank(input)) {
            return 0;
        }
        return sum(toInts(split(input)));
    }

    // 빈값을 체크한다.
    private boolean isBlank(String input) {

        return input == null || input.isEmpty();
    }

    // 문자열을 나눈다
    private String[] split(String input) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(input);
        if(m.find()){
            String customDelimehter = m.group(1);
            return m.group(2).split(customDelimehter);
        }
        
        return input.split(",|:");
    }

    // 숫자로 변환한다.
    private int[] toInts(String[] values) {
        int[] numbers = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            numbers[i] = toPositive(values[i]);
        }

        return numbers;
    }

    // 음수 여부를 체크한다.
    private int toPositive(String input) {
        int number = Integer.parseInt(input);
        if(number < 0) {
            throw new RuntimeException();
        }
        return number;
    }

    // 합계를 구한다.
    private int sum(int[] numbers) {
        int sum =0;
        for(int number : numbers){
            sum += number;
        }
        return sum;
    }

}
