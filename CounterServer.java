import java.rmi.*;
import java.rmi.server.*;

import java.rmi.registry.*;

public class CounterServer implements Counter {
	public CounterServer(){}
	public int value = 1;

	public static void main (String args[]){
        try{
                CounterServer server = new CounterServer();
                Counter stub = (Counter) UnicastRemoteObject.exportObject(server, 0);
                
                Registry registry = LocateRegistry.getRegistry();
                registry.bind("counterKey", stub);
                
                System.out.println("Counter pronto");
                
       	 } catch(Exception e){
               	 e.printStackTrace();
        	}
	}

	public int getvalue() throws RemoteException {
		System.out.println("Executando getvalue()");
		return value;
	}
	
	public int nextValue() throws RemoteException {
		System.out.println("Executando nextValue()");
		value++;
		return value;
	}
}
