import java.lang.Exception;
import java.io.*;
class MulMatrix{
	public static void main(String args[]) throws IOException{
	DataInputStream ds=new DataInputStream(System.in);
	int m,n,p,q,i,j,k;
	int sum=0;
	
	System.out.println("Enter no.of rows and column for first matrix:");
	m=Integer.parseInt(ds.readLine());
	n=Integer.parseInt(ds.readLine());

	int first[][]=new int[m][n];
	System.out.println("Enter elements for first matrix");
	for(i=0;i<m;i++){
	   for(j=0;j<n;j++){
		first[i][j]=Integer.parseInt(ds.readLine());
	  }
	}
	System.out.println("Enter no.of rows and column for second matrix:");
	p=Integer.parseInt(ds.readLine());
	q=Integer.parseInt(ds.readLine());

	if(n != p){
	System.out.println("Multiplication of matrices not possible");
	}
	else{
	int second[][]=new int[p][q];
	int multiply[][]=new int[m][q];
	System.out.println("Enter elements of second matrix");
	for(i=0;i<p;i++){
	   for(j=0;j<q;j++){
		second[i][j]=Integer.parseInt(ds.readLine());
	  }
	}
	//printing matrix1 and matrix2
	System.out.println("Matrix1");
	for(i=0;i<m;i++){
	   for(j=0;j<n;j++){
		System.out.print(first[i][j] +"\t");
	  }
	  System.out.println();
	}
	System.out.println("Matrix2");
	for(i=0;i<p;i++){
	   for(j=0;j<q;j++){
		System.out.print(second[i][j] +"\t");
	  }
	  System.out.println();
	}
	//Process of Multiplication
	for(i=0;i<m;i++){
	   for(j=0;j<q;j++){
		for(k=0;k<p;k++){
	    		sum=sum+first[i][k]*second[k][j];
		}
		multiply[i][j]=sum;
		sum=0;
	  }
	}
	System.out.println("Product of Matrix1 and Matrix2");
	for(i=0;i<m;i++){
	   for(j=0;j<q;j++){
		System.out.print(multiply[i][j] +"\t");
	  }
	  System.out.println();
	}
	}
	}
}