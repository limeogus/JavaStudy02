public class StringCalculator {
    
    public int add(String input){

        if(input == null || input.isEmpty()){
            return 0;
        }
        
        String[] values = input.split(",");
        return sum(toInts(values));
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
