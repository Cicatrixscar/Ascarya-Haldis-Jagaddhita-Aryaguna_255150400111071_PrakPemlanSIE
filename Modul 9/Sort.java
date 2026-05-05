import java.util.*;

public class Sort {

    public static int[] bubble(int[] list) {
        int tukarAtauGeser = 0;
        for (int i = 0; i < list.length - 1; i++) {
            for (int k = i + 1; k < list.length; k++) {
                //System.out.printf("%d:%d\n", list[k], list[i]);
                if (list[k] < list[i]) { 
                    int t = list[i];
                    list[i] = list[k];
                    list[k] = t;
                    tukarAtauGeser++;
                }
            }
        }
        System.out.println("Bubble, Jumlah Tukar : " + tukarAtauGeser);
        return list;
    }

    public static int[] insertion(int[] list) {
        int tukarAtauGeser = 0;
        for (int i = 1; i < list.length; ++i) {
            int key = list[i];
            int k = i - 1;
            /*
            * Move elements of arr[0..i-1], that are greater than key,
            * to one position ahead of their current position
            */
            while (k >= 0 && list[k] > key) {
                list[k + 1] = list[k];
                k = k - 1;
                tukarAtauGeser++;
            }
            list[k + 1] = key;
        }
        System.out.println("Insertion, Jumlah Tukar : " + tukarAtauGeser);
        return list;
    }

    public static int[] selection(int[] list) {
        int tukarAtauGeser = 0;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum element in unsorted array
            int maxIndex = i;
            for (int k = i + 1; k < list.length; k++) {
                if (list[k] < list[maxIndex]) 
                    maxIndex = k;
            }
            // Swap the found minimum element
            // with the first element
            int t = list[maxIndex];
            list[maxIndex] = list[i];
            list[i] = t;
            tukarAtauGeser++;
        }
        System.out.println("Selection, Jumlah Tukar : " + tukarAtauGeser);
        return list;
    }

    public static void main(String[] args) {
        // ubah nilai default Array ini menjadi sebanyak 30 elemen
        // acak/tidak terurut dan nilai elemennya tidak ada yang ganda.
        int[] arr = { 47, 3, 85, 62, 19, 74, 31, 56, 90, 8, 43, 67, 25, 11, 78, 34, 53, 99, 6, 71, 28, 88, 15, 64, 42, 97, 50, 22, 83, 37 };
        //int[] sorted = bubble(arr);
        
        int[] arrBubble = arr.clone();
        System.out.println("Sebelum (Bubble) : " + Arrays.toString(arrBubble));
        System.out.println("Sesudah (Bubble) : " + Arrays.toString(bubble(arrBubble)));

        int[] arrInsertion = arr.clone();
        System.out.println("Sebelum (Insertion) : " + Arrays.toString(arrInsertion));
        System.out.println("Sesudah (Insertion) : " + Arrays.toString(insertion(arrInsertion)));

        int[] arrSelection = arr.clone();
        System.out.println("Sebelum (Selection) : " + Arrays.toString(arrSelection));
        System.out.println("Sesuddah (Selection) : " + Arrays.toString(selection(arrSelection)));
    }
}