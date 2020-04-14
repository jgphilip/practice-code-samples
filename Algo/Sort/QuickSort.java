///////////////////////////////////////////////////////////////
// Program : Quick Sort

import java.io.*;
import java.util.Scanner;

public class QuickSort {

    public int n;
    public int[] intArray;

    public QuickSort() {
        n = 0;
    }

    public int getN() {
        return n;
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        n = sc.nextInt();

        intArray = new int[n];
        System.out.println("Enter the contents of the array : ");
        for (int i = 0; i < n; i++) {
            intArray[i] = sc.nextInt();
        }
    }

    public void display() {
        for (int i = 0; i < n; i++) {
            System.out.print(intArray[i] + " ");
        }
    }

    public void sort(int low, int high) {
        if (low < high) {
            int partitionIndex = partition(low, high);
            sort(low, partitionIndex - 1);
            sort(partitionIndex + 1, high);
        }
    }

    public int partition(int low, int high) {
        int pivot = intArray[high];
        int i = low - 1;
        int temp;
        for (int j = low; j <= high; j++) {
            if (intArray[j] < pivot) {
                i++;
                temp = intArray[i];
                intArray[i] = intArray[j];
                intArray[j] = temp;
            }
        }
        temp = intArray[i + 1];
        intArray[i + 1] = intArray[high];
        intArray[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {

        QuickSort quickSort = new QuickSort();

        quickSort.accept();

        System.out.println("The contents of the array : ");
        quickSort.display();

        System.out.println("\n Sorting... ");
        int l = quickSort.getN();
        quickSort.sort(0, l - 1);

        System.out.println("The sorted contents of the array : ");
        quickSort.display();
    }
}
