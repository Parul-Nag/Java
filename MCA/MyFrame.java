import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame{
    public static void main(String [] args){
        MyFrame f=new MyFrame();
        f.setTitle("Frame1");
        f.setSize(800,800);
        f.setVisible(true);
        f.addWindowListener(new Myclass());
    }
}
class Myclass extends WindowAdapter{
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}