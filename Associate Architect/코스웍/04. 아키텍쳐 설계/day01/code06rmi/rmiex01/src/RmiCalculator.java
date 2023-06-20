import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.*;

public class RmiCalculator extends UnicastRemoteObject implements RmiCalculatorIntf {
    public static final String MESSAGE = "Hello World";

    public RmiCalculator() throws RemoteException {
        super(0); // required to avoid the 'rmic' step, see below
    }

	@Override
	public Integer add(int i, int j) throws RemoteException {
		// TODO Auto-generated method stub
		return i+j;
	}

    public static void main(String args[]) throws Exception {
        System.out.println("RMI Calculator started");

        try { //special exception handler for registry creation
            LocateRegistry.createRegistry(1099);
            System.out.println("Calculator RMI registry created.");
        } catch (RemoteException e) {
            //do nothing, error means registry already exists
            System.out.println("Calculator RMI registry already exists.");
        }
           
        //Instantiate RmiServer
        RmiCalculator server = new RmiCalculator();

        // Bind this object instance to the name "RmiServer"
        Naming.rebind("//localhost/RmiCalculator", server);
        System.out.println("PeerServer bound in registry");
    }
}