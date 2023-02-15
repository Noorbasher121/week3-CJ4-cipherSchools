
import java.util.*;
import java.io.*;
import java.lang.*;
public class String3 {
    public static void main(String[] args) {
        System.out.println("  =======================");
    char arr[]={'c','i','p','h','e','r'};
    String strFromArr=new String(arr);
    System.out.println(strFromArr);
    String partialStrFromArr=new String(arr,1,3);
    System.out.println(partialStrFromArr);

    //changing the case
    String name1="noor";
    System.out.println(name1.toUpperCase());
    String name2="NOOR";
    System.out.println(name2.toLowerCase());
    System.out.println(name1);


    System.out.println("6.spliting");
    System.out.println("please enter your full name");
    Scanner sc=new Scanner(System.in);
    String fullname=sc.nextLine();
    String strArr[]=fullname.split(6,10);
    }
}
