package local.wagenhuber.guenther;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class EchoImpl extends UnicastRemoteObject implements Echo{

    public EchoImpl() throws RemoteException {
    }

    public String getEcho(String s) throws RemoteException {
        return s;
    }

}
