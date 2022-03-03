import java.rmi.*;
import java.rmi.server.*;

import java.rmi.registry.*;

public class HelloServer implements HelloWorld {
	public HelloServer(){}

	public static void main (String args[]){
        try{
                HelloServer server = new HelloServer();
                HelloWorld stub = (HelloWorld) UnicastRemoteObject.exportObject(server, 0);
                
                Registry registry = LocateRegistry.getRegistry();
                registry.bind("helloKey", stub);
                
                System.out.println("HelloServer pronto");
                
       	 } catch(Exception e){
               	 e.printStackTrace();
        	}
	}

	public String hello() throws RemoteException {
		System.out.println("Executando hello()");
		return "Hello!!!";
	}
	
	public String hello1() throws RemoteException {
		System.out.println("Executando hello1()");
		return "Hello1!!!";
	}
}
