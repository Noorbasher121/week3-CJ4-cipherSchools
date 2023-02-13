import java.util.Scanner;

class reverse{
   static void  reverse(int arr[],int n){
    int low=0, high=n-1;
    while(low<high){
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
        low++;
     high--;
}

}




    public static void main(String[] args){
       
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
           
       }
       reverse(arr,n);
       for(int i=0;i<n;i++){
           System.out.print(arr[i]+ " ");
       }
          }
       }

    


