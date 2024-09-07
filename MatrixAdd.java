import java.util.*;
class MatrixAdd{
    public static void main(String[] args) {
        int r1,r2,c1,c2;

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

        System.out.println("Enter no. of rows and column in Matrix2: ");
        r2=input.nextInt();
        c2=input.nextInt();
    
        //constructing 2 dimensional array of name Matrix2
        int Matrix2[][]=new int[r2][c2];
    
        if(r1==r2 && c1==c2){
            System.out.println("Enter elements in matrix2:");
            for(int i=0;i<r2;i++){
              for(int j=0;j<c2;j++){
                Matrix2[i][j]=input.nextInt();
            }
        }
        //process of adding Matrix1 and Matrix2

        int Matrix3[][]=new int[r1][c1];
        System.out.println("Addition of matrix1 and Matrix2");

        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
              Matrix3[i][j]=Matrix1[i][j]+Matrix2[i][j];
              System.out.print(Matrix3[i][j]+ " ");
            }
            System.out.println(" ");
        }
        }
        else{
            System.out.println("Order Mismatched...! Addition of matrix not possible");
        }
    }
   
}