import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

    public static void main(String[] args) {
        try {
            Hello stub = (Hello) Naming.lookup("rmi://localhost:1099/Hello");
            System.out.println(stub.digaOla());

        } catch (NotBoundException | MalformedURLException | RemoteException  e) {
            e.printStackTrace();
        }
    }
}
