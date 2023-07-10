public class CalculatorMain {
    public static void main(String[] args) throws Exception {
        Calculator cal = new Calculator();
        System.out.println(cal.add(9, 3));
        System.out.println(cal.substract(9, 3));
        System.out.println(cal.multiply(9, 3));
        System.out.println(cal.divide(9, 3));
    }
}
