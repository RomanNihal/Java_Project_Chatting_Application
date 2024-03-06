package function;

import java.util.ArrayList;
import javax.swing.JTextArea;

public class Method {
    
    private static int clientID;
    private static ArrayList<Client> clients;
    private static JTextArea txt;

    public static JTextArea getTxt() {
        return txt;
    }

    public static void setTxt(JTextArea aTxt) {
        txt = aTxt;
    }

    public static int getClientID() {
        return clientID;
    }

    public static void setClientID(int aClientID) {
        clientID = aClientID;
    }

    public static ArrayList<Client> getClients() {
        return clients;
    }

    public static void setClients(ArrayList<Client> aClients) {
        clients = aClients;
        clientID = 1;
    }

    public static int addClient(Client client) {
        clients.add(client);
        return clientID++;
    }
}
