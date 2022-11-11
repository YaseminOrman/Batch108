package day08stringmanipulationloops;

public class ForLoop01Review {
    public static void main(String[] args) {

        //Example 1: Type code to print "Hi!" five times on the console

        for(int i=1 ; i<6 ; i++ ){
            System.out.print("Hi" + " ");
        }
        System.out.println();

        //2.Example: Type all integers from 11 to 44 in the same line with a space between consecutive integers

        for( int i= 11 ; i<45 ; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        //3.Example: Type all integers from 44 to 11 in the same line with a space between consecutive integers

        for(int i= 44 ; i>10 ; i--){
            System.out.print(i + " ");
        }

        System.out.println();

        //4.Example: Type even integers from 11 to 44 in the same line with a space between consecutive integers

        for( int i= 11 ; i <45 ; i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }

        System.out.println();
        //5.Example: Type odd integers from 68 to 13 in the same line with a space between consecutive integers
        for(int i = 68 ; i>12 ; i--){
            if(i%2==1){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //6.Example: Type all integers which are divisible by 4 and not divisible by 6 from 120 to 11 in the same line with a space between consecutive integers

        for( int i= 120 ; i >10 ; i--){
            if(i%4==0 && i%6!=0){
                System.out.print(i + " ");
            }
        }


    }

}
