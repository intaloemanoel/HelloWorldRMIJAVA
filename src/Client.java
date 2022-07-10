import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

    public static void main(String[] args) {
        try {
            Pi stub = (Pi) Naming.lookup("rmi://localhost:1099/Hello");
            System.out.println("O resultado de Pi eh " + stub.computePi());

        } catch (NotBoundException | MalformedURLException | RemoteException  e) {
            e.printStackTrace();
        }
    }
}
