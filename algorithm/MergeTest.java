public class MergeTest {
    public static void main(String[] args) {
        int[] A = {21, 28, 35, 40, 61, 75};
        int[] B = {16, 25, 47, 54};  // size 4
        int[] C = new int[20]; // enough to hold all the elements
        int n = merge(A, 6, B, 4, C);
        for (int j = 0; j < n; j++) System.out.printf("%d ", C[j]);
        System.out.printf("\n"); 

    } // end main

    // merge goes here
    public static int merge(int[] A, int m, int [] B, int n, int C) {
        int i = 0; // i points to the first (smallest ) number in A
        int j = 0; // j points to the first (smallest ) number in B
        int k = -1; // k will be incremented before storing a number in C[K]
        while (i < m && j < n) {
            if (A[i] < B[j]) C[++k] = A[i++];
            else C[++k] = B[i++];
        }
        if (i == m) // copy B[j] to B[n-1] to C
            for (; j < n; j++) C[++k] = B[j];
        else // j == n , copy A[i] to A[m-1] to C
            for (; i < m; i++) C[++k] = A[i];
        return n+m;
    } // end merge
}
