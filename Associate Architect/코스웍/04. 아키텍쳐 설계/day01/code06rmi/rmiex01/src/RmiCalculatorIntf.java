import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RmiCalculatorIntf extends Remote {
	Integer add(int i, int j) throws RemoteException;
}