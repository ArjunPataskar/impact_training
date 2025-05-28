public class InsertionSort {
    public static void insertionsort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 11, 2, 4, 1};
        
        System.out.print("Original array:");
        for(int num : arr) 
        {
            System.out.print(num + " ");
        }

        insertionsort(arr);

        System.out.print("\nSorted array:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
