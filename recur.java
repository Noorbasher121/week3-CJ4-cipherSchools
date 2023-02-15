
import java.util.*;
public class recur {


    static int  getRecur(int n){
       int res=1;
       if(n==0){
   return 0;

    }
    n=n+getRecur(n-1);
    return n;
    
}
  
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      
      System.out.println(getRecur(n));
        }
      

}
