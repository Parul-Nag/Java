import java.net.*;
public class MyUrl {
    public static void main(String [] j) throws Exception{
        URL obj=new URL("https://www.google.com:80/index.html");
        System.out.println("Protocol "+obj.getProtocol());
        System.out.println("Host "+obj.getHost());
        System.out.println("File "+obj.getFile());
        System.out.println("Port "+obj.getPort());
        System.out.println("Path "+obj.getPath());
        System.out.println("External form "+obj.toExternalForm());
    }
}
