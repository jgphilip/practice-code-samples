///////////////////////////////////////////////////////////////
// Program : Selection Sort

import java.io.*;
import java.util.Scanner;

public class SelectionSort{

	public int n;
	public int[] intArray;
	
	public SelectionSort(){
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
		int ss,sn,temp;
		for(int i = 0 ; i < n-1; i++){
			ss = intArray[i];
			sn = i;

			for(int j=i+1  ; j< n; j++){
				if(intArray[j] < ss){
					ss =intArray[j];
					sn = j;
				}
			}

			temp = intArray[i];
			intArray[i] = intArray[sn];
			intArray[sn] =temp;	
		}
	}
	public static void main(String[] args){

		SelectionSort selectionSort = new SelectionSort();
		
		selectionSort.accept();
		
		System.out.println("The contents of the array : ");
		selectionSort.display();

		System.out.println("Sorting... ");
		selectionSort.sort();

		System.out.println("The sorted contents of the array : ");
		selectionSort.display();
	}
}