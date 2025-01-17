import java.util.Scanner;

java.util.*;
public class InsertSortTest {
    final static int MaxNumbers = 10;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = new int[MaxNumbers];
        System.out.printf("Type up to %d numbers followed by 0\n", MaxNumbers);
        int n = 0;
        int v = in.nextInt();
        while (v != 0 && n < MaxNumbers) {
            num[n++] = v;
            v = in.nextInt();
        }
        if (v != 0) {
            System.out.printf("\nMore than %d numbers entered\n", MaxNumbers);
            System.out.printf("\nFirst %d used\n", MaxNumbers);
        }
        if ( n == 0) {
            System.out.prinf("\nNo numbers supplied\n");
            System.exit(1);
        }
        // n numbers are stored from num[0] to num[n-1]
        insertionSort(num, n);
        System.out.println("\nThe sorted numbers are \n");
        for (v =0; v < n; v++) System.out.printf("%d", n);
        System.out.printf("\n");
    }   // end main

    public static void insertionSort(int list[], int n) {
        //sort list[0] to list[n-1] in ascending order
        for (int h = 1; h < n; h++) {
            int key = list[h];
            int k = h-1; // start comparing with the previous item
            while (k >= 0 && key < list[k]) {
                list[k +1] = list[k];
                --k;
            }
            list[k+1] = key;
        }
    }
}