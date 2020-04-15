///////////////////////////////////////////////////////////////
// Program : Heap Sort

import java.io.*;
import java.util.Scanner;

public class HeapSort {

    public int length;
    public int[] intArray;

    public HeapSort() {
        length = 0;
    }

    public int getN() {
        return length;
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        length = sc.nextInt();

        intArray = new int[length];
        System.out.println("Enter the contents of the array : ");
        for (int i = 0; i < length; i++) {
            intArray[i] = sc.nextInt();
        }
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }

    public void sort(int n) {
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(n, i);

        for (int i = n - 1; i > 0; i--) {
            int temp = intArray[0];
            intArray[0] = intArray[1];
            intArray[1] = temp;
            heapify(i, 0);
        }
    }

    public void heapify(int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && intArray[l] > intArray[largest])
            largest = l;

        if (r < n && intArray[r] > intArray[largest])
            largest = r;

        if (largest != i) {
            int temp = intArray[i];
            intArray[i] = intArray[largest];
            intArray[largest] = temp;
            heapify(n, largest);
        }
    }

    public static void main(String[] args) {

        HeapSort heapSort = new HeapSort();

        heapSort.accept();

        System.out.println("The contents of the array : ");
        heapSort.display();

        System.out.println("\n Sorting... ");
        int l = heapSort.getN();
        heapSort.sort(l);

        System.out.println("The sorted contents of the array : ");
        heapSort.display();
    }
}
