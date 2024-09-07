import java.io.*;
public class CreateFile {
    public static void main(String[] args) throws IOException {
        //attach keyboard to dataInputStream
        DataInputStream dis=new DataInputStream(System.in);
        FileOutputStream fout=new FileOutputStream("Myfile.txt");
        System.out.println("Enter text(@ to end writing): ");
        char ch;
        while ((ch=(char) dis.read()) !='@') 
            fout.write(ch);
            fout.close();
        
    }
}
