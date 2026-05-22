
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    
    public int add(String input){

        if(isBlank(input)) {
            return 0;
        }
        return sum(toInts(split(input)));
    }

    private boolean isBlank(String input) {

        return input == null || input.isEmpty();
    }

    private String[] split(String input) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(input);
        if(m.find()){
            String customDelimehter = m.group(1);
            return m.group(2).split(customDelimehter);
        }
        
        return input.split(",|:");
    }

    private int[] toInts(String[] values){
        int[] numbers = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            numbers[i] = Integer.parseInt(values[i]);
        }

        return numbers;
    }

    private int sum(int[] numbers) {
        int sum =0;
        for(int number : numbers){
            sum += number;
        }
        return sum;
    }

}
