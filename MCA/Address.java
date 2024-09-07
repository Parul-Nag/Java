import java.io.*;
import java.net.*;
public class Address {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Website: ");
        String site=br.readLine();
        try {
            InetAddress ip=InetAddress.getByName(site);
            System.out.println("The IP address is: "+ip);
        } catch (Exception e) {
            System.out.println("Website not found");
        }
    }
}
