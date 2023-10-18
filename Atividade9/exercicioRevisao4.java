package Atividade9;

public class exercicioRevisao4 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Calcular Fibonacci de " + n);
        int resultado = calculateFibonacci(n);
        System.out.println("RESULTADO: " + resultado);
    }

    public static int calculateFibonacci(int n) {
        if (n <= 1) {
            return n; // Base case: The Fibonacci of 0 is 0, and the Fibonacci of 1 is 1.
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2); // Recursive case: Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
        }
    }
}
