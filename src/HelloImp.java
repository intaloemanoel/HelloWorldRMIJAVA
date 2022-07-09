import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImp extends UnicastRemoteObject implements Hello {

    protected HelloImp() throws RemoteException {
        super();
    }

    private static final long serialVersionUID = 1L;

    @Override
    public String digaOla() throws RemoteException {

        return "Hello world!";
    }
}
