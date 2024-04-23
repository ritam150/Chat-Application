package chatclient;
import chat.ChatInterface;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.ChatView;
import view.WelcomeView;

public class ChatClient {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {        
            Registry registry = LocateRegistry.getRegistry("localhost", 9999);
            ChatInterface chat = (ChatInterface)registry.lookup("chatServer");  //getting a remote reference       
            new WelcomeView(chat);  //pass the reference as a parameter 
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
