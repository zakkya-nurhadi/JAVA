public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9, 99, 112, 213, 12, 32, 55, 1142, 1, 2, 8, 6, 5, 4, 3, 7, 20, 32, 33, 35, 85, 12, 22, 11, 90};

        System.out.println("Array sebelum diurutkan:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("\nArray setelah diurutkan:");
        printArray(arr);
    }

    // Metode untuk melakukan Bubble Sort
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                // Jika elemen saat ini lebih besar dari elemen berikutnya, tukar
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Metode untuk mencetak elemen array
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
