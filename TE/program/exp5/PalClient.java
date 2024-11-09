
import java.rmi.*;
public class PalClient {
	public static void main(String args[]) 
		{
		try 
			{
			String palServerURL = "rmi://" + args[0] + "/PAL-SERVER";
			PalServerIntf palServerIntf = (PalServerIntf)Naming.lookup(palServerURL);
			int n = 515;
			int m=palServerIntf.pal(n);
			if(m==1)
				System.out.println("Palindrome Number ");
			else
				System.out.println("Not Palindrome Number ");
			}
		catch(Exception e) 
			{
			System.out.println("Exception: " + e);
			}
		}
}
