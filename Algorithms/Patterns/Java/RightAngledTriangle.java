package Algorithms.Patterns.Java;


//RIGHT ANGLED TRIANGLE PATTERN //

/*=======PATTERN       
 * * * 
 * * 
 * 
 =========EXAMPLE*/


import java.util.Scanner;

public class RightAngledTriangle {
    
    static void RightAngledTrianglePattern(int N)
        {
            for(int row = 0; row < N; row++)
            {
                for(int col = row; col < N; col++)
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
