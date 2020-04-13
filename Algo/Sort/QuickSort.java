///////////////////////////////////////////////////////////////
// Program : Quick Sort

import java.io.*;
import java.util.Scanner;

public class QuickSort{

	public int n;
	public int[] intArray;
	
	public QuickSort(){
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

         QuickSort quickSort = new QuickSort();
                
         quickSort.accept();
                
                System.out.println("The contents of the array : ");
         quickSort.display();

                System.out.println("\n Sorting... ");
         quickSort.sort();

                System.out.println("The sorted contents of the array : ");
         quickSort.display();
	}
}
