public class BinarySearchString {
    final static int MaxNames = 8;
    public static void main(String args[]){
        String name[] =  {"Graham, Ariel", "Perrot, Chloe", "Charles, Kandice", "Seecharan, Anella",
        "Reyes, Aaliyah", "Graham, Ashleigh", "Reyes, Ayanna", "Greaves, Sherrelle"};
        
        int n = binarySearch("Charles, Kandice", name, 0, MaxNames-1);
        System.out.printf("%d\n", n);
        // will print 0, Location of Charles, Kandice
        
        n = binarySearch("Reyes, Ayanna", name, 0, MaxNames-1);
        System.out.printf("%d\n", n); // will print 6, location of Reyenes, Ayanna

        n = binarySearch("Perrot, Chlohe", name, 0, MaxNames -1);
        System.out.printf("%d\n", n); // will print 4 ,location of Perrott, Chloe

        n = binarySearch("Graham, Ariel", name, 4, MaxNames-1); // will print -1 , since Graham, Ariel is not in locations 4 to 7
        System.out.printf("%d\n", n);

        n = binarySearch("Cato, Brittney", name, 0, MaxNames -1);
        System.out.printf("%d\n", n); // will print -1, since Cato Brittney is not in the list
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
    static int binarySearch(String key, String [] list, int lo, int hi) {
        // Search for key from list[lo] to list[hi]
        // if found , return its location ; otherwise, return -1
        insertionSort3(list, lo, hi);
        while (lo <= hi) {
            int mid = (lo + hi) /2;
            int cmp = key.compareTo(list[mid]);
            if (cmp == 0) return mid; // search succeds
            if (cmp < 0) hi = mid -1; // key is 'less than' list[mid]
            else lo = mid + 1; // key is 'greater than' list[mid]

        }
        return -1; // lo and hi have crossed; key not found
    }
}