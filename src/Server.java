import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) throws RemoteException {
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://localhost:1099/Hello" , new HelloImp());

            System.out.println("Servidor online!");
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }



    }
}
