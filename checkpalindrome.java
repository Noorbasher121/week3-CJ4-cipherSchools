
import java.util.*;
import java.lang.*;

public class checkpalindrome {
    static boolean isAnagram(String s1, String s2) 
    { 
       
        if (s1.length() != s2.length()) 
            return false; 
            s1=s1.toLowerCase();
            
            s2=s1.toLowerCase();
            int n=s1.length();
            int freqArr1[]=new int[26];
            int freqArr2[]=new int[26];
  
      for (int i=0;i<n;i++){
        int index1=s1.charAt(i)-'a';
        freqArr1[index1]++;

        //for index2
       int index2=s2.charAt(i)-'a';
       freqArr1[index2]++;
      }   
      for(int i=0;i<26;i++){
  if(freqArr1[i]!=freqArr2[i]){
    return false;
  }
      }
      return true;
     } 
  
    public static void main(String args[]) 
    { 
        String s1 = "abaac"; 
        String s2 = "aacba";  
       System.out.println( isAnagram(s1,s2));
           
    } 
} 

