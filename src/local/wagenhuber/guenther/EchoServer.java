package local.wagenhuber.guenther;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class EchoServer {


    public static void main(String[] args) throws MalformedURLException, RemoteException {

        //TCP-Port für RMI-Registry
        int registryPort = Integer.parseInt(args[0]);

        //Port für Server
        int port = Integer.parseInt(args[1]);

        //Erstellt eine lokale RMI-Registry
        LocateRegistry.createRegistry(registryPort);


        Remote remote = new EchoImpl(port);
        Naming.rebind("//:" + registryPort + "/echo", remote);
        System.out.println("Echoserver gestartet...");
    }

}
