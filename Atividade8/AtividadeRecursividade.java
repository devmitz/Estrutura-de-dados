package Atividade8;

public class AtividadeRecursividade {
    public static void main(String[] args) {
        int n = 50; // Replace with the desired Fibonacci term you want to calculate
        int result = calculateFibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }

    public static int calculateFibonacci(int n) {
        if (n <= 1) {
            return n; // Base case: The Fibonacci of 0 is 0, and the Fibonacci of 1 is 1.
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2); // Recursive case: Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
        }
    }
}
