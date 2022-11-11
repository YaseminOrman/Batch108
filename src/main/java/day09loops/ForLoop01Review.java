package day09loops;

public class ForLoop01Review {
    public static void main(String[] args) {
        //Example 1: Type code to reverse a String
        //           For Example: Tom ==> moT
        String name ="yasemin";
        String revName="";

        for(int i =name.length()-1 ; i>-1 ; i--){
            char c =name.charAt(i);
         revName =   revName+c;

        }
        System.out.println(revName);

        //Example 2: Find the sum of the integers from 3 to 6
        int sum =0;
        for(int i = 3 ; i<7  ; i++){
          sum = sum + i;
        }
        System.out.println(sum);

        //Example 3: Find the multiplication of the integers from 3 to 6

        int multiplication = 1;
        for(int i = 3 ; i<7  ; i++){
            multiplication= multiplication*i;
        }
        System.out.println(multiplication);

        //Example 4: Type code to find the digits of an integer
        //   584 ==> 5+8+4=17

        int num = 584;
        num= Math.abs(num);
        int sumOfDigits=0;
        for(int i= num ; i>0 ; i=i/10 ){
            sumOfDigits = sumOfDigits + i%10;
        }
        System.out.println(sumOfDigits);
    }
}
