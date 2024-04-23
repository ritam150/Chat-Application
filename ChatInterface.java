package chat;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ChatInterface extends Remote{
    // declaring methods to call remotely
    public boolean login(String username) throws RemoteException;
    public void logout(String username) throws RemoteException;
    public void sendMessage(Message message) throws RemoteException;
    public List<Message> getAllMessages() throws RemoteException;
    public List<String> getAllUsers() throws RemoteException;
}
