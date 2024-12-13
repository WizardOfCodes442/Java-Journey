import java.util.*;
public class SortStrings {
    final static int MaxNames = 8;
    public static void main(String[] args){
        String name[] = {"Graham, Ariel", "Perrot, Chloe", "Charles, Kandice", "Seecharan, Anella",
                            "Reyes, Aaliyah", "Graham, Ashleigh", "Reyes, Ayanna", "Greaves, Sherrelle"};
        
        insertionSort3(name, 0, MaxNames - 1);
        System.out.printf("\nThe sorted names are \n\n");
        for (int h = 0; h < MaxNames; h++)
            System.out.printf("%s\n", name[h]);
    }

    public static void insertionSort3(String[] list, int lo, int hi) {
        // sort list[lo] to list[hi] in ascending order
        for (int h = lo+1; h <= hi; h++) {
            String key = list[h];
            int k = h-1; // start comparing with previous items
            while (k >= lo && key.compareToIgnoreCase(list[k]) < 0) {
                list[k+1] = list[k];
                --k;
            }
            list[k+1] = key;
        }
    }
}