package Algorithms.SelectionSort.Java;

// Selection Sort 

import java.util.Scanner;
public class Selectionsort 
{

    public static void main(String a[]){

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
         selectionsort(size,input_array);
       
    }

    public static void selectionsort(int n ,int[] arr) {

        
        int i,j,temp,min;
        for(i=0; i <=n-2; i++)
        {
            min=i;
            for(j=i+1; j<=n-1;j++)
            {
                if(arr[j]<arr[min]){
                    min=j;
                    
                }

            }
                    temp =arr[min];
                    arr[min]=arr[i];
                    arr[i]=temp;

        }
        System.out.println("The sorted array is");
        for(i=0; i<n; i++){
           
            System.out.println(arr[i]);
        }
       
    }
}  