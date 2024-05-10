import java.rmi.*;
import java.rmi.server.*;
public class PalServerImpl extends UnicastRemoteObject implements PalServerIntf {
	public PalServerImpl() throws RemoteException {
							}
	public int pal(int n) throws RemoteException 
	{
		int r,sum=0,temp; 
		temp=n;    
		while(n>0)
			{    
			r=n%10;  //getting remainder  
			sum=(sum*10)+r;    
			n=n/10;    
			}    
		if(temp==sum)
			{    
			//System.out.println("palindrome number ");    
			return 1;
			}
		else    
			{
			//System.out.println("not palindrome");
			return 0;
			}    
			
	}	
}
