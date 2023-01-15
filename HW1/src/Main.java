public class Main {

    public static void main(String[] args) {

        //Рекурсивно найти n-ое число Фибоначчи. Определить сложность. (fn[0] = 0 или 1) [fn(n) = (fn(n - 1) + fn(n - 2)]
        // O(n) = 2 ^ n

        System.out.println("FibRecursive = " + FibRecursive(8));


        //Найти n-ое число Фибоначчи за O(n).

        System.out.println("Fib = " + Fib(4));


        //Найти сумму элементов главной диагонали в двумерном массиве.
        //Найти сумму элементов побочной диагонали в двумерном массиве.
        //1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 ```java

        int[][] matrix =
                {
                        {1, 2, 3, 4, 5},
                        {1, 2, 3, 4, 5},
                        {1, 2, 3, 4, 5},
                        {1, 2, 3, 4, 5},
                        {1, 2, 3, 4, 5},
                };

        findMainDiagonalSum(matrix);
        findSecondDiagonalSum(matrix);

        int[] array = { 1, 2, 3, 4, 5 };
        int shift = 2;

        Shift(array, shift);
    }



    //Рекурсивно найти n-ое число Фибоначчи. Определить сложность. (fn[0] = 0 или 1) [fn(n) = (fn(n - 1) + fn(n - 2)]
    // O(n) = 2 ^ n
    static int FibRecursive(int n)
    {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return FibRecursive(n - 1) + FibRecursive(n - 2);
    }


    static int Fib(int count)
    {
        int n1 = 0;
        int n2 = 1;

        if (count == 0)
            return n1;
        if (count == 1)
            return n2;

        while (count > 2)
        {
            n2 += n1;
            n1 = n2 - n1;
            count--;
        }

        return n2 + n1;
    }


    //Найти сумму элементов главной диагонали в двумерном массиве.
    static void findSecondDiagonalSum(int[][] matrix)
    {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++)
        {
            sum += matrix[matrix.length - i - 1][i];
        }
        System.out.println("Second diagonal sum = " + sum);
    }


    //Найти сумму элементов побочной диагонали в двумерном массиве.
    static void findMainDiagonalSum(int[][] matrix)
    {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++)
        {
            sum += matrix[i][i];
        }
        System.out.println("Main diagonal sum = " + sum);
    }


    //4.Реализовать сдвиг элементов в массиве на n влево или вправо.
    static void Shift(int[] array, int shift)
    {
        shift *= -1;
        for (int i = 0; i < array.length; i++)
            System.out.print(array[(array.length + i + shift) % array.length]);
    }
}