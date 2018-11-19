///////////////////////////////////////////////////////////////
// Program : Merge Sort

import java.io.*;
import java.util.Scanner;

public class MergeSort{

	public int n;
	public int[] intArray;
	
	public MergeSort(){
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
		//TODO
	}
	public static void main(String[] args){

		MergeSort mergeSort = new MergeSort();
		
		mergeSort.accept();
		
		System.out.println("The contents of the array : ");
		mergeSort.display();

		System.out.println("Sorting... ");
		mergeSort.sort();

		System.out.println("The sorted contents of the array : ");
		mergeSort.display();
	}
}