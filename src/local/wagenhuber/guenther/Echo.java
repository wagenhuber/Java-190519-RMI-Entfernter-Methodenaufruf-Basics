package local.wagenhuber.guenther;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Echo extends Remote {

    String getEcho(String s) throws RemoteException;
}
