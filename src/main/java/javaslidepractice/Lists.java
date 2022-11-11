package javaslidepractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {

        public static void main(String[] args) {
            //1)Create a String list whose elements are A, C, E, and F. Print it on the console.

            List<String> a=new ArrayList<>();
            a.add("A");
            a.add("C");
            a.add("E");
            a.add("F");
            System.out.println(a);

            //)By using add() with index method, add B into the 1st index.
            //List elements should be like A, B, C, E, and F. Print it on the console

            a.add(1,"B");
            System.out.println(a);

            //By using set() method, convert E to D.
            //List elements should be like A, B, C, D, and F. Print it on the console

            a.set(3,"D");
            System.out.println(a);

            //By using remove() method, remove F from the list.
            //List elements should be like A, B, C, D. Print it on the console
            a.remove("F");
            System.out.println(a);

            System.out.println(a.size());

            //Find the sum of the elements in the array { {1,2,3}, {4,5}, {6,7} } and return an array.
            // For example; for { {1,2,3}, {4,5}, {6,7} } output will be {6, 9, 13}


            int arr[][]={ {1,2,3}, {4,5}, {6,7} };
            int sum=0;
            int i=0;
            int arr2[] = new int[arr.length];
            for(int []w:arr) {

                for(int m :w ) {
                    sum=sum+m;

                }
                arr2[i] = sum;
                sum=0;
                i++;
            }
            System.out.println(Arrays.toString(arr2));











        }
    }

