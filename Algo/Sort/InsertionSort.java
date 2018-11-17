///////////////////////////////////////////////////////////////
// Program : Insertion Sort

import java.io.*;
import java.util.Scanner;

public class InsertionSort{

	public int n;
	public int[] intArray;
	
	public InsertionSort(){
		n = 0;
	}

	public void accept(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		n = sc.nextInt();

		intArray = new int[n];
		System.out.println("Enter the contents of the array : ");
		for(int i = 0;i<n;i++){
			intArray[i] = sc.nextInt();
		}
	}

	public void display(){
		for(int i = 0;i<n;i++){
			System.out.print(intArray[i] + " ");
		}
	}

	public void sort(){
		int key,j;
		for(int i = 1 ; i < n; i++){
			j=i;
			while( j > 0 && intArray[j] < intArray[j-1]){
				key = intArray[j];
				intArray[j] = intArray[j-1];
				intArray[j-1] =key;	
				j--;
			}
		}
	}
	public static void main(String[] args){

		InsertionSort insertionSort = new InsertionSort();
		
		insertionSort.accept();
		
		System.out.println("The contents of the array : ");
		insertionSort.display();

		System.out.println("\n Sorting... ");
		insertionSort.sort();

		System.out.println("The sorted contents of the array : ");
		insertionSort.display();
	}
}