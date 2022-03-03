import java.rmi.registry.*;

public class HelloClient {
	public static void main(String args[]){
		String host = (args.length < 1) ? null : args[0];
		try {
			Registry registry = LocateRegistry.getRegistry(host);
			
			// HelloServer
			// HelloWorld stub = (HelloWorld) registry.lookup("helloKey");
			
			// String msg = stub.hello();
			// System.out.println("Mensagem do servidor: " + msg);
			// System.out.println("Mensagem de HelloServer: " + stub.hello1());
			
			// CounterServer
			Counter stub = (Counter) registry.lookup("counterKey");
			System.out.println("Mensagem de CounterServer getvalue(): " + stub.getvalue());
			System.out.println("Mensagem de CounterServer nextValue(): " + stub.nextValue());
			
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
