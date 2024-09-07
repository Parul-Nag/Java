import java.lang.Exception;
import java.io.*;
class TransMatrix{
	public static void main(String args[])throws IOException{
	DataInputStream ds=new DataInputStream(System.in);
	int r1,c1;

	System.out.println("Enter rows and column of Matrix1:");
	r1=Integer.parseInt(ds.readLine());
	c1=Integer.parseInt(ds.readLine());

	int Matrix1[][]=new int[r1][c1];
	System.out.println("Enter elements in matrix1");
	for(int i=0;i<r1;i++)
	  for(int j=0;j<c1;j++)
		Matrix1[i][j]=Integer.parseInt(ds.readLine());

	System.out.println("Matrix1");
	for(int i=0;i<r1;i++){
	  for(int j=0;j<c1;j++){
		System.out.print(Matrix1[i][j]+"\t");
	   }
	  System.out.println();
	}

	int transMat[][]=new int[c1][r1];
	for(int i=0;i<r1;i++)
	  for(int j=0;j<c1;j++)
		transMat[j][i]=Matrix1[i][j];

	System.out.println("Transpose of Matrix1");
	for(int i=0;i<c1;i++){
	  for(int j=0;j<r1;j++){
		System.out.print(transMat[i][j]+"\t");
	   }
	  System.out.println();
	}
	
 }
}