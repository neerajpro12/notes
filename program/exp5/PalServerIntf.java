import java.rmi.*;
public interface PalServerIntf extends Remote {
	int pal(int n) throws RemoteException;
}
