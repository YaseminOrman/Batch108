package day26exception;

public class E01 {
    public static void main(String[] args) {
        printAge(25);

        try {
            printAge(-25);
        }catch(IllegalArgumentException e){
            System.out.println("Age is not valid");
        }

        try {
            printWorkerAge(14);
            }catch(IllegalArgumentException e){
            System.out.println("Age is not valid to be worker");
        }
    }

    //Create a method to print the given age
    public static void printAge(int age){
        if(age<0){
            throw new IllegalArgumentException("Age cannot be negative");
        }
        System.out.println(age);
    }

    //Create a method to print worker's age
    public static void printWorkerAge(int age ){
        if(age<16){
            throw new IllegalArgumentException("A worker's age cannot be less than 16");
        }
        System.out.println(age);
    }
    }

