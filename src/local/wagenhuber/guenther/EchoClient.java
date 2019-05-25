package local.wagenhuber.guenther;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class EchoClient {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        if (args.length != 3) {
            System.err.println("java EchoClient <host> <port> <text>");
            System.exit(1);
        }

        String host = args[0];
        int port = Integer.parseInt(args[1]);
        String text = args[2];

        //Default Port RMI-Registry TCP/1099
        Echo remote = ((Echo) Naming.lookup("//" + host + ":" + port + "/echo"));
        String received = remote.getEcho(text);
        System.out.println(received);
    }

}
