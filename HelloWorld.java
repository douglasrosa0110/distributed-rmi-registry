import java.rmi.*;

public interface HelloWorld extends Remote {
	public String hello() throws RemoteException;
	public String hello1() throws RemoteException;
}

