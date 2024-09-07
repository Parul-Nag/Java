class Sorting{
    public static void main(String[] args) {
        int[] arr=new int[]{8,5,9,3,9,2};
        int temp=0;

        //Displaying array in original form
        System.out.println("Array Before Sorting:");
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }

        //Process of Sorting an array
        for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

          }
        }
        System.out.println();
        System.out.println();
        //Displaying array after sorting in ascending form
        System.out.println("Array After Sorting:");
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
    }

}