import java.util.Scanner;

public class FibonacciChecker {
    public static boolean isFibonacci(int num) {
        int a = 0, b = 1;
        while (a <= num) {
            if (a == num) {
                return true;
            }
            int next = a + b;
            a = b;
            b = next;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        
        if (isFibonacci(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " NÃO pertence à sequência de Fibonacci.");
        }
        
        scanner.close();
    }
}