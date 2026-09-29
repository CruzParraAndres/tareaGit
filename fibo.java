import java.util.Scanner;

    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static void printFibonacci(int n, int i) {
        if (i == n) {
            return;
        }

        System.out.print(fibonacci(i) + " ");

        printFibonacci(n, i + 1);
    }

    public static void main(String[] args) {
        int n = 10;

        printFibonacci(n, 0);
class Fibo {

    static void printFibonacci(int n) {
        // Validación habitual de parámetros
        if (n <= 0) {
            throw new IllegalArgumentException("El número de términos debe ser mayor a 0.");
        }

        System.out.println("Serie de Fibonacci (" + n + " términos):");

        long first = 0;
        long second = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(first + (i < n - 1 ? ", " : ""));

            long next = first + second;
            first = second;
            second = next;
        }
        System.out.println(); // Salto de línea final
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de términos: ");

        // Validación estándar de tipo de dato
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            try {
                printFibonacci(n);
            } catch (IllegalArgumentException e) {
                System.err.println("Error: " + e.getMessage());
            }
        } else {
            System.err.println("Error: Debe ingresar un número entero válido.");
        }

        scanner.close();
    }
}