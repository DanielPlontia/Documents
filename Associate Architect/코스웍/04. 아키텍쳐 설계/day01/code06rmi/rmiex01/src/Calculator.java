import java.rmi.Naming;

public class Calculator {
    public static void main(String args[]) throws Exception {
        RmiServerIntf server = (RmiServerIntf)Naming.lookup("//localhost/RmiCalculator");
        System.out.println(server.integerPlus(3,5));
    }
}