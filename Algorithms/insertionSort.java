package Algorithms;

import java.util.Scanner;

public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        UtilClass use = new UtilClass();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array: ");
		int n = scan.nextInt();
		int array[] = new int[n];
       System.out.println("Enter the elements in the array: ");
        for(int i=0;i<n;i++) 
        {
        	array[i]  = scan.nextInt();
        }
        
        use.insertionSort(array);
        for(int i=0;i<n;i++) 
        {
        	System.out.print(array[i]+" ");
        }
	}

}
