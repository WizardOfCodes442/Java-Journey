public class BinarySearchTest {
    public static void main(String [] args) {
        int [] num = {17, 24, 31, 39, 44, 49, 56, 66, 72, 78, 83, 89, 96};
        int n= binarySearch(66, num, 0, 12);
        System.out.printf("%d\n", n); //will print 7; 66 in position 7
        n = binarySearch(66, num, 0, 6);
        System.out.printf("%d\n", n); // will print -1; 66 is not in pos. 0 to 6
        n = binarySearch(70, num, 0, 12);
        System.out.printf("%d\n", n); // will print -1 , 77 is not in the list
        n = binarySearch(89, num, 5, 12);
        System.out.printf("%d\n", n); // will print 11; 89 in position 11
    }

    public static int binarySearch(int key, int [] list, int lo, int hi) {
        // search for key from list[lo] to list[hi]
        // if found, return its location otherwise return -1;

        while (lo <= hi) {
            int mid = (lo +hi)/ 2;
            if (key == list[mid]) return mid; // found 
            if (key < list[mid]) hi = mid -1;
            else lo = mid + 1;

        }
        return -1; // lo and hi have crossed; key not found
    }
}