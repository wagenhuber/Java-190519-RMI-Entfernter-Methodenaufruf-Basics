package local.wagenhuber.guenther;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class EchoServer {

    public static void main(String[] args) throws MalformedURLException, RemoteException {
        Remote remote = new EchoImpl();
        Naming.rebind("echo", remote);
        System.out.println("Echoserver gestartet...");
    }

}
