import java.util.*;
class VectorDemo{
	//@SuppressWarnings("unchecked")
	public static void main(String args[]){
	Vector list=new Vector();
	int length=args.length;

	//add elements as argument in vector
	System.out.println("Elements of Vector:");
	for(int i=0;i<length;i++){
	list.addElement(args[i]);
	System.out.println(" "+ args[i]);
      }
	int size=list.size();

      //ArrayList<String> arrlist = new ArrayList<String>();
	String arrlist[]=new String[size];

	//copy vector in array
	list.copyInto(arrlist);

	//sorting or rearranging element
	for(int i=0;i<length;i++){
	   for(int j=0;j<length;j++){
	     if(arrlist[i].compareTo(arrlist[j]) <0){
		String temp=null;
		temp=arrlist[i];
		arrlist[i]=arrlist[j];
		arrlist[j]=temp;
	  }
	 }
	}
	System.out.println("Elements after re-arranging and copy into Array:");
	for(int i=0;i<length;i++){
	System.out.println(" "+ arrlist[i]);
      }
 }
}