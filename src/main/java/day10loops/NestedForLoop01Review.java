package day10loops;

import java.util.Scanner;

public class NestedForLoop01Review {
    public static void main(String[] args) {
           /*
    1.Example:Type code to get the output like
                Week: 1
                  Day: 1
                  Day: 2
                  Day: 3
                  .....
                Week: 2
                  Day: 1
                  Day: 2
                  Day: 3
                  ....
                Week: 3
                  Day: 1
                  Day: 2
                  Day: 3
                  ....
      */

        for(int i=1 ; i <5 ; i++){
            System.out.println("Week:  " + i);

        for(int k =1 ; k<8 ; k++) {
            System.out.println("   Day:  " + k);
        }
        }
       /* 2.Example: Write a Java Program to Print Rectangle Star Pattern using For Loop
                 ****
                 ****
                 ****
        Note: Get the number of rows and columns from user
                */

        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number of row ");
        int row =input.nextInt();
        System.out.println("Enter the number of column ");
        int column =input.nextInt();

        for(int i=1 ;i <row+1 ; i++ ){
            for(int k =1 ; k<column+1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*
            3.Example: Type code to get the output like
                        1
                        1 2
                        1 2 3
                        1 2 3 4
                        1 2 3 4 5
        */

        System.out.println("Enter the number of row");
        int rows= input.nextInt();

        for (int i = 1; i <=rows ; i++) {
            for (int k = 1; k <=i; k++) {
                System.out.print(k);

            }
            System.out.println();
        }
    }
}








