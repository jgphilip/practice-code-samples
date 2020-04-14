// Program : Bubble Sort

import java.io.*;
import java.util.Scanner;

public class BubbleSort {

	public int n;
	public int[] intArray;

	public BubbleSort() {
		n = 0;
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

	public void sort() {
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (intArray[j] < intArray[j + 1]) {
					int temp = intArray[j];
					intArray[j] = intArray[j + 1];
					intArray[j + 1] = temp;
				}
			}
			for (int m = 0; m < n; m++) {
				System.out.print(intArray[m] + " ");
			}
			System.out.print("\n");

		}
	}

	public static void main(String[] args) {

		BubbleSort bubbleSort = new BubbleSort();

		bubbleSort.accept();

		System.out.println("The contents of the array : ");
		bubbleSort.display();

		System.out.println("\n Sorting... ");
		bubbleSort.sort();

		System.out.println("The sorted contents of the array : ");
		bubbleSort.display();
	}
}
