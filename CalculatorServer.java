import java.rmi.Naming;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;
public class CalculatorServer {
  public static void main(String[] args) {
    try {
        int port = 7777;
LocateRegistry.createRegistry(port);
        CalculatorImpl c = new CalculatorImpl();
        System.out.println("Expoting Calculator...");
        UnicastRemoteObject.exportObject(c,port);
        Naming.bind("rmi://localhost:7777/MyCalculator", c);
        System.out.println("Register Calculator!!");
    } catch (Exception e) {
        System.out.println(e);
    }  
    

  }
}
