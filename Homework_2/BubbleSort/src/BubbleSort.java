public class BubbleSort {
    public void sort(int[] arr) {
        int n = arr.length;
        boolean sorted;

        for(int i = 0; i < n - 1; i++) {
            sorted = true;
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                    sorted = false;
                }
            }
            if(sorted) {
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
