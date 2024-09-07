import java.util.*;
class Transpose{
public static void main(String[] args) {
    int r1,c1;

    Scanner input=new Scanner(System.in);

    System.out.println("Enter no. of rows and column in Matrix1: ");
    r1=input.nextInt();
    c1=input.nextInt();

    //Constructing 2dimensional array of name Matrix1
    int Matrix1[][]=new int[r1][c1];

    //Taking input as element from user
    System.out.println("Enter elements in matrix1:");
    for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){
            Matrix1[i][j]=input.nextInt();
        }
    }


    //constructing Transpose Matrix
    int TransposeMat[][]=new int[c1][r1];

        for(int i=0;i<r1;i++){
          for(int j=0;j<c1;j++){
            TransposeMat[j][i]=Matrix1[i][j];
        }
    }
    //output of transpose Matrix1 

    System.out.println("Transpose of matrix1");

    for(int i=0;i<c1;i++){
        for(int j=0;j<r1;j++){
          System.out.print(TransposeMat[i][j]+ " ");
        }
        System.out.println(" ");
    }
    
}
}