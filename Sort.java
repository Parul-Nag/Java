class Sort{
 public static void main(String args[]){
 int arr[]=new int[]{8,78,5,1,9,5};
 
 System.out.println("Before sorting array");
 System.out.println();
 for(int i=0;i<arr.length;i++){
   System.out.print(arr[i]+", ");
  }
 //process of sorting
 for(int i=0;i<arr.length;i++){
   for(int j=i+1;j<arr.length;j++){
	if (arr[i]>arr[j]){
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
    }
   }
  }
 System.out.println();
 System.out.println();
 System.out.println("After sorting array");
 System.out.println();
 for(int i=0;i<arr.length;i++){
 System.out.print(arr[i]+", ");
  }
 }
}