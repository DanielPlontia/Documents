
public class TestClient {

	public static void main(String[] args) {
		PrintService sl = new PrintServiceImpl1("printSvc1","Printerl"); 
		PrintService s2 = new PrintServiceImpl2("printSvc3","Printer2");
		Client client = new Client (); 
		client.doTask (); 
	}

}
