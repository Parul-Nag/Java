import java.util.*;
class DemoVector{
public static void main(String[] args) {
    Vector v1=new Vector();
    v1.addElement("Java");
    v1.addElement("C++");
    v1.addElement("Oracle");
    v1.addElement("C#");
    v1.add(0,"PHP");
    System.out.println("Vector 1: "+v1);
    Vector v2=new Vector();
    System.out.println("After copying elements of Vector1 into Vector 2 ");
    v2.addAll(v1);
    System.out.println("Vector 2: "+ v2);
    System.out.println("Element Value: "+v1.get(1));
    v1.remove(1);
    System.out.println("After Removal from vector1: "+ v1);
    System.out.println("Element Value: "+ v1.get(1));
    v2.clear();
    System.out.println("After clear vector2: "+ v2);
    System.out.println("vector2 Size: "+ v2.size()); 
    System.out.println("vector2 Size: "+ v1.size());
}
}