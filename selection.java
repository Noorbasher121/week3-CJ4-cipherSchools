public class selection {
  static   void getSelect(int arr[],int n){
        int temp;
    for(int i=0;i<n;i++){
       int  min_idx=i;
       for(int j=i+1;j<n;j++){
        if(arr[j]<arr[min_idx]){
            min_idx=j;
           
        }
       }
       temp=arr[i];
            arr[i]=arr[min_idx];
            arr[min_idx]=temp;
    }
    }
    public static void main(String[] args) {
        int arr[]={64,25,12,22,11},n=5;
    getSelect(arr,n);
    for(int i=0;i<n;i++){
        System.out.println(arr[i]);
    }
    }
    
}
