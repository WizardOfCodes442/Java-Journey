/**insertion sort of an array of characters into nonp-decreasing order */
public class Sorting {
    public static void insertionSort(char[] data){
        int n = data.length;
        for(int k = 1;k < n; k++){ //begin with second character
            char cur = data[k];    //time to insert cur = data[k]
            int j = k;             //find current index j for cur
            while (j > 0 && data[j-1] > cur){ //thus, data[j-1] must go after cur
                data[j] = data[j-1];    //slide data[j-1] rightward
                j--;                    //and consider previous j for cur

            }
            data[j] =cur;       //this is the proper place for cur

        }
    }

    public static void main(String[] args){
        char[] data = {'B', 'C', 'D', 'A', 'E', 'H', 'G', 'F'};
        insertionSort(data);
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i]);
            System.out.print(", ");
        }
    }
}