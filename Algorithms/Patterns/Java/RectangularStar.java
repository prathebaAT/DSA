package Algorithms.Patterns.Java;

// RECTANGULAR STAR PATTERN //

/*=======PATTERN       
 * * * 
 * * *
 * * *
 =========EXAMPLE*/

import java.util.Scanner;
 
    class RectangularStar
    
    {
        static void Rectangularpattern(int N)
        {
            for(int row = 0; row < N; row++)
            {
                for(int col = 0; col < N; col++)
                {
                    System.out.print("* ");
                }
                
                System.out.println("");

            }
        }
        public static void main(String args[])
        {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the Number of rows:");
            
            int input_number = sc.nextInt();

            Rectangularpattern(input_number);
           
             sc.close();
         }


    }


 



