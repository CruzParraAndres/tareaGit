class fibo {

    static void printFibonacci(int n)
    {
        int first = 0;
        int second = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args)
    {
        int n = 10;

        printFibonacci(n);
    }
}