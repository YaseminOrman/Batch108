package javaslidestringmanipulation;

import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {
        //Ask user ta enter his/her first and last name.
        // If the first name is longer output will be “First name is longer.”
        // If the length of last name is equal To the length of last name output will be “First name and last name have same length.”
        // Otherwise, output will be “Last name is longer”

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first and last name please");
        String name =input.nextLine();

        if(name.length()>name.length()){
            System.out.println("");
        }
    }
}
