//Konkrete Implementierung der Methoden (von Interface Echo)
//Unicast Remote Object -> Objekt wird remote-fähig gemacht um Client/Server-Kommunikation zu ermöglichen
//stellt das entfernte Objekt dar

package local.wagenhuber.guenther;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class EchoImpl extends UnicastRemoteObject implements Echo{

    public EchoImpl(int port) throws RemoteException {
    super(port);
    }

    public String getEcho(String s) throws RemoteException {
        return s;
    }

}
