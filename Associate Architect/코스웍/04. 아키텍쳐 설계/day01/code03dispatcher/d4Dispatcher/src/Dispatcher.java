
import java.util.*;
public class Dispatcher {
	Hashtable<String,PrintService> registry = new Hashtable<String, PrintService>(); 	
	public void registerService(String svc, PrintService obj) {
		if (registry.get(svc) == null) {
			registry.put(svc, obj) ; 
		} 
	} 
	public PrintService locateServer(String svc)	{ 
		PrintService v = (PrintService) registry.get(svc);
		return v;
	}
}
