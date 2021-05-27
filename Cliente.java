import java.io.OutputStream;  
import java.net.InetAddress;  
import java.net.Socket;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class TCPClient {

  public static final void main(final String[] args) {
    Socket        client;
    OutputStream  os;
    InetAddress   ia;
    
     for ( int j = 5; (--j) >= 0;) {
  	 InputStreamReader r=new InputStreamReader(System.in);  
	Scanner br=new Scanner(r);  
  	System.out.println("Ingresar el numero"); 
  	int numero = br.nextInt();
    try {
    
   
  	
      ia = InetAddress.getByName("100.100.50.21");//get local host address
      
      client = new Socket(ia, 9999); //create socket (*@\clientBox{1+2)}@*)
     
      
      os = client.getOutputStream(); //get stream to write to
 	
	//String number=br.readLine();  
	os.write(numero);  //write one byte of value 1 (*@\clientBox{3)}@*)
      	
      
   
      
      client.close(); //close (*@\clientBox{4)}@*)
      }
     catch (Throwable t) {
      t.printStackTrace();
    }
    }
  }
}




