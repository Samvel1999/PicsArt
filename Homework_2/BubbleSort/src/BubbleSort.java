public class BubbleSort {
    public void sort(int[] arr) {
        int n = arr.length;
        boolean isSorted;

        for(int i = 0; i < n - 1; i++) {
            isSorted = true;
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {

                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                    
                    isSorted = false;
                }
            }
            if(isSorted) {
                break;
            }
        }
    }

    public void print(int[] arr) {
        int n = arr.length;

        for(int item : arr) {
            System.out.print(item + " ");
        }
    }
}
