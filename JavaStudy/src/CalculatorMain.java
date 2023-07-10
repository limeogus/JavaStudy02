public class CalculatorMain {
    public static void main(String[] args) throws Exception {
        Calculator cal = new Calculator();
        divide(cal);
        multiply(cal);
        substract(cal);
        add(cal);
    }

    private static void divide(Calculator cal){
        System.out.println(cal.divide(9, 3));
    }

    private static void multiply(Calculator cal){
        System.out.println(cal.multiply(9, 3));
    }

    private static void substract(Calculator cal){
        System.out.println(cal.substract(9, 3));
    }

    private static void add(Calculator cal){
        System.out.println(cal.add(9, 3));
    }
}
