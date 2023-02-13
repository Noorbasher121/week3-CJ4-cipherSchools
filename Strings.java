
import java.util.*;
import java.lang.*;
import java.io.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
       // String  a=sc.next();
       // String  b=sc.next();
      // String a="core";
      // String b="java";
      // int c=a.compareTo(b);
     // boolean d=a.equals(b);
      // System.out.println(c);
      //if(a.contains("RE")){
     //   a+=b;
     //// }else{
      //  b+="langauge";
     // }
     //String c=b+a;
      //  System.out.print(b+a);
      String str1="abc";
      String str2=new String("abc");
      StringBuffer str=new StringBuffer("abc");
      str.setCharAt(0,'d');
      
      //String st3=str1+str2;
      System.out.println(str);
     // System.out.print( str1== str2);
      //System.out.print(str1.equals(str2));
    }
}
