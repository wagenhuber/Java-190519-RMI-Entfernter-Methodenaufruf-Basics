//Extents Remote ermöglicht es, Methoden entfernt zur Verfügung zu stellen
//Interface stellt zudem die Sicht des Clients auf verfügbaren Methoden dar

package local.wagenhuber.guenther;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Echo extends Remote {

    String getEcho(String s) throws RemoteException;
}
