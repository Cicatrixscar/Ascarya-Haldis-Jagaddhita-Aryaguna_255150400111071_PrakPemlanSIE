public class Search {
    public static int linearSearch(int[] arr, int search) {
        int check = 0; //Tambahkan
        for (int i = 0; i < arr.length; i++) {
            check++; //Tambahkan
            if (arr[i] == search) {
                System.out.println("Linear Search, Jumlah Pemeriksaan : " + check); //Tambahkan
                return i;
            }
        }
        System.out.println("Linear Search, Jumlah Pemeriksaan : " + check); //Tambahkan
        return -1;
    }

    public static int binarySearch(int[] arr, int search) {
        int check = 0; //Tambahkan
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            check++; //Tambahkan
            int mid = low + (high - low) / 2;
            if (arr[mid] == search) {
                System.out.println("Binary Search, Jumlah Pemeriksaan : " + check); //Tambahkan
                return mid;
            }
            if (arr[mid] < search)
                low = mid + 1;
            else
                high = mid - 1;
        }
        System.out.println("Binary Search, Jumlah Pemeriksaan : " + check); //Tambahkan
        return -1;
    }

    public static void main(String[] args) {
        int[] data = { 2, 5, 9, 13, 17, 21, 26, 30, 35, 39, 44, 48, 52, 57, 61, 65, 70, 74, 78, 82, 88, 91, 93, 95, 96,
                97, 98, 99, 100, 101 };
        
        /*int hasil1 = linearSearch(data, 88);
        System.out.println("Hasil (dalam indeks) : " + hasil1);*/
        
        int hasil2 = linearSearch(data, 50);
        System.out.println("Hasil (dalam indeks) : " + hasil2);

        /*int hasil3 = binarySearch(data, 88);
        System.out.println("Hasil (dalam indeks) : " + hasil3);*/

        int hasil4 = binarySearch(data, 50);
        System.out.println("Hasil (dalam indeks) : " + hasil4);
    }
}