import java.net.*;
import java.rmi.*;
public class PalServer {
public static void main(String args[]) 
	{
	try {
		PalServerImpl palServerImpl = new PalServerImpl();
		Naming.rebind("PAL-SERVER", palServerImpl);
		}
	catch(Exception e) {
		System.out.println("Exception: " + e);
		}
	}
}
