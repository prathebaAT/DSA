package Algorithms.BubbleSort.Java;

//Bubble sort

import java.util.Scanner;
public class Bubblesort {
            public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Number of elements:");
                int size = sc.nextInt();
                int i;
                
                int input_array[] = new int[size];
                System.out.println("Enter the Elements of the array");
                for( i = 0;i<size;i++)
                {
                     
                    input_array[i] = sc.nextInt();
                }
                bubblesort(size,input_array);

                
            }
            

            public static void bubblesort(int n, int[] arr) 
            {
                int i,j,temp;

                for(i=n-1;i>=1;i--)
                {
                    for(j=0;j<=i-1;j++)
                    {
                        if(arr[j]>arr[j+1])
                        {
                            temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1]=temp;
                        }
                    }
                }
                System.out.println("The sorted array");
             for(i=0;i<n;i++){
                System.out.println(arr[i]);
             }   
            }
   
}
