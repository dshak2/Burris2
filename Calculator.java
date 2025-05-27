public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int num1 = 10;
        int num2 = 5;
        int sum = calculator.add(num1, num2);
        System.out.println("The sum is: " + sum);
    }

    public int add(int a, int b) {
        return a + b;
    }
}
