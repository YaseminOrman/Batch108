package day11contructorsmethodcallstatickeyword;

public class DoWhile01Review {
    public static void main(String[] args) {
        /*
            Type code to print digits just in the decimal part of the given decimal number with an asterix. For example; 75.4238 ⇒ *4*2*3*8
        */
        double num = 75.4238;
        String str= String.valueOf(num);
        String s ="";
        int i =0;

        String decPart=str.split("\\.")[1];
        do{
            String r =decPart.substring(i,i+1);
            i++;
            s = s + "*"+ r;

        }while(i<decPart.length());
        System.out.println(s);
    }

}
