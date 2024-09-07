import java.util.*;
import java.io.*;
import java.lang.Exception;
class MulAdd{
	public static void main(String args[]) throws IOException{
	DataInputStream ds=new DataInputStream(System.in);
	int r1,c1,r2,c2;

	System.out.println("Enter rows and column of Matrix1:");
	r1=Integer.parseInt(ds.readLine());
	c1=Integer.parseInt(ds.readLine());

	int Matrix1[][]=new int[r1][c1];
	System.out.println("Enter elements in matrix1:");
	for(int i=0;i<r1;i++)
	  for(int j=0;j<c1;j++)
		Matrix1[i][j]=Integer.parseInt(ds.readLine());

	System.out.println("Enter rows and column of Matrix2:");
	r2=Integer.parseInt(ds.readLine());
	c2=Integer.parseInt(ds.readLine());

	int Matrix2[][]=new int[r2][c2];
	if(r1==r2 && c1==c2){
	System.out.println("Enter elements in matrix2:");
	for(int i=0;i<r2;i++)
	  for(int j=0;j<c2;j++)
		Matrix2[i][j]=Integer.parseInt(ds.readLine());

	//Printing matrix1 and matrix2
	System.out.println("Matrix1");
	for(int i=0;i<r1;i++){
	  for(int j=0;j<c1;j++){
		System.out.print(Matrix1[i][j]+"\t");
	  }
	  System.out.println();
	}
	System.out.println("Matrix2");
	for(int i=0;i<r2;i++){
	  for(int j=0;j<c2;j++){
		System.out.print(Matrix2[i][j]+"\t");
	  }
	  System.out.println();
	}

	System.out.println("Addition of Matrix1 and Matrix2");
	int Matrix3[][]=new int[r1][c2];
	for(int i=0;i<r1;i++){
	  for(int j=0;j<c2;j++){
		Matrix3[i][j]=Matrix1[i][j]+Matrix2[i][j];
		System.out.print(Matrix3[i][j]+"\t");
	 }
	System.out.println();
	}
	}
	else
		System.out.println("Order Mismatched...Addition of Matrices not possible");
 }
}