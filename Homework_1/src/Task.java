public class Task {
    public static void main(String[] args) {
        //task 1: Create an array and fill it with 2 number.
        int[] array1 = {12, 14};

        //task 2: Create an array and fill it with numbers from 1:1000.
        int[] array2 = new int[1000];

        for(int i = 0; i < array2.length; i++) {
            array2[i] = i + 1;
        }

        //task 3: Create an array and fill it with odd numbers from -20:20.
        int[] array3 = new int[20];
        int i = 0;

        for(int j = -19; j < 20; j += 2) {
            array3[i] = j;
            i++;
        }

        //task 4: Create an array and fill it. Print all elements which can be divided by 5.

        int[] array4 = {14, 15, 20, 11, 4, 9, 6, 5, 100};

        for(int j = 0; j < array4.length; j++) {
            if(array4[j] % 5 == 0) {
                System.out.println(array4[j]);
            }
        }
        System.out.println();

        //task 5: Create an array and fill it. Print all elements which are between 24.12 and 467.23.
        int[] array5 = {36, 4, 95, 122, 21, 417, 221, 22};

        for(int j = 0; j < array5.length; j++) {
            if(array5[j] > 24.12 && array5[j] < 467.23) {
                System.out.println(array5[j]);
            }
        }
        System.out.println();

        //task 6: Create an array and fill it. Print count of elements which can be divided by 2.
        int[] array6 = {23, 56, 4, 9, 11, 99, 14, 6};
        int countOfEvens = 0;

        for(int j = 0; j < array6.length; j++) {
            if(array6[j] % 2 == 0) {
                countOfEvens++;
            }
        }

        System.out.println(countOfEvens);
        System.out.println();

        //task 7: Given an integer, 0<N<21, print its first 10 multiples.
        //Each multiple N x i(where 0<i<11) should be printed on a new line in the
        //form: N x i = result.
        int N = 2;
        System.out.println("Input N = " + N);
        System.out.println("Output");

        for(int j = 1; j <= 10; j++) {
            System.out.println(N + " x " + j + " = " + N * j);
        }
        System.out.println();

        //task 8: Is the number power of 2?
        int n = 16;

        //First version
        System.out.println((n & (n - 1)) == 0);
        System.out.println();

        //Second version
        while(n > 1) {
            n /= 2;
        }

        if(n == 1) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
