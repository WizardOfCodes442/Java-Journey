import java.util.*;
public class ParallelSort {
    final static int MaxNames = 8;
    public static void main(String[] args) {
        String name[] =  {"Graham, Ariel", "Perrot, Chloe", "Charles, Kandice", "Seecharan, Anella",
        "Reyes, Aaliyah", "Graham, Ashleigh", "Reyes, Ayanna", "Greaves, Sherrelle"};
        int id[] = {3050, 2795, 4455, 7824, 6669, 5000, 5464, 6050};
        
        parallelSort(name, id, 0, MaxNames-1);

        System.out.printf("\n The Sorted names and IDs are \n\n");
        for (int h =0; h < MaxNames; h++)
            System.out.printf("%-20s %d\n", name[h], id[h]);
        
    }

    public static void parallelSort(String [] list, int id[], int lo, int hi) {
        //Sort the names in list[lo] to list[hi] in alphabeltical order,
        // ensuring that each name remains with its original id number

        for (int h = lo +1; h  <= hi; h++) {
            String key = list[h];
            int m = id[h]; // extract the id number
            int k = h - 1; // start comparing with the previous item
            while (k >= lo && key.compareToIgnoreCase(list[k]) < 0) {
                list[k +1] = list[k];
                id[k+1] = id[k]; // move up id number when we move a name
                --k;
            }
            list[k+1] = key;
            id[k+1] = m; //store id in the same position as the name
        }
    }
}