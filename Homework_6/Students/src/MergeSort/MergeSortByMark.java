package MergeSort;

import model.Student;

public class MergeSortByMark {
    public static void sort(Student[] arr, int l, int r) {
        if(l < r) {
            int m = l + (r - l)/2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, r);
        }
    }

    public static void merge(Student[] arr, int l, int r) {
        int m = l + (r - l)/2;
        int n1 = m - l + 1;
        int n2 = r - m;
        Student[] left = new Student[n1];
        Student[] right = new Student[n2];

        for(int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }

        for(int j = 0; j < n2; j++) {
            right[j] = arr[m + j + 1];
        }

        int i = 0, j = 0, k = 0;

        while(i < n1 && j < n2) {
            if(left[i].getMark() < right[j].getMark()) {
                arr[l + k] = left[i];
                i++;
            }
            else {
                arr[l + k] = right[j];
                j++;
            }
            k++;
        }

        if(i < n1) {
            while(i < n1) {
                arr[l + k] = left[i];
                i++;
                k++;
            }
        }
        else {
            while(j < n2) {
                arr[l + k] = right[j];
                j++;
                k++;
            }
        }
    }
}
