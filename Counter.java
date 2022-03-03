import java.rmi.*;

public interface Counter extends Remote {
	public int getvalue() throws RemoteException;
	public int nextValue() throws RemoteException;
}

