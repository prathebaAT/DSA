package Algorithms.InsertionSort.Java;

import java.util.Scanner;

public class Insertionsort {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int i;
        int input_array[] = new int [size];
        System.out.println("Enter the Elements of the array " + size);
        for(i=0; i<size; i++)
        {
            input_array[i] = sc.nextInt();
        }
         insertionsort(size,input_array);
    }

    public static void insertionsort(int n, int[] arr) {
        
    int i,j,temp;
    for(i=0;i<=n-1;i++){
    j=i;
    while(j>0 && arr[j-1]>arr[j])
    {
        
        temp = arr[j - 1];
        arr[j - 1] = arr[j];
        arr[j] = temp;
        j--;
    }
    }
    System.out.println("The sorted array is");
        for(i=0; i<n; i++){
           
            System.out.println(arr[i]);

    }
    
}
}
