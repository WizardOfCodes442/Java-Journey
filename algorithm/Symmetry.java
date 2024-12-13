import java.util.Scanner;
public class Symmetry {



    public int[] difference (int[] A, int[] B){
        int difference[] = {};
        int count = 0;
        for(int i = 0; i < A.length; i++){
            for (int j = 0; j < B.length; j++){
                if(A[i] != B[j]){
                    difference[count] = B[j];
                    count++;
                }
            }
        }
        return difference;
    }
     public int[] merge(int [] A, int [] B){
        int merged[] = {};
        merged = A.clone();
        merged = B.clone();
        return merged;
 
    }
    public int[] symmetry(int [] A, int [] B){
        int C[] = difference(A, B);
        int D[] = difference(B, A);
        int E[] = merge(C, D);
        return E;
    }

    
    public static void main(String[] args){
        Scanner input;
        int [] A;
        int [] B;
        input = new Scanner(System.in);
        int size = input.nextInt();
        A = new int[size];
        B = new int[size];
        System.out.print("Enter values contained in Set A: ");
        for (int i = 0; i < size; i++){
            A[i] = input.nextInt();
        }
        System.out.print("Enter values contained in Set B: ");
        for (int i = 0; i < size; i++ ){
            B[i] = input.nextInt();
        }
        Symmetry set = new Symmetry();
        int z[] = {};
        z = set.symmetry(A, B); 
        
        System.out.print("{ ");
        for (int i = 0; i < z.length; i++){
            System.out.print(z[i] + " ") ;
        }
        System.out.println(" }");
    }
}
