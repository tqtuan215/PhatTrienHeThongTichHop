import java.rmi.*;

public interface Calculator extends Remote{
    public int addNum(int x, int y) throws RemoteException;
 public int tru(int x, int y) throws RemoteException;
 public int nhan(int x, int y) throws RemoteException;
 public float chia(float x, float y) throws RemoteException;
}