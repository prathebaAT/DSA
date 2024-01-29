package Algorithms.Patterns.Java;


//RIGHT ANGLED TRIANGLE PATTERN //

/*=======PATTERN       
 * * * 
 * * 
 * 
 =========EXAMPLE*/


import java.util.Scanner;

public class RightAngledTriangle {
    
    static void RightAngledTrianglePattern(int size)
        {
            for(int row = 0; row < size; row++)
            {
                for(int col = row; col < size; col++)
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

            RightAngledTrianglePattern(input_number);
           
             sc.close();
         }


}
