interface PrintService {
	void runService();
	void greeting();
}
class PrintServiceImpl1 implements PrintService{
	String nameofservice; // service name 
	String nameofserver; // server name 

	public PrintServiceImpl1(String svc, String srv) {
		nameofservice = svc; 
		nameofserver = srv;
		Client.dsp.registerService(nameofservice,this) ; 
	} 

	public void runService() { 
		//test output 
		System.out.println("Service " + nameofservice + " by " + nameofserver); 
		greeting();
	}

	@Override
	public void greeting() {
		// TODO Auto-generated method stub
		System.out.println("æ»≥Á«œººø‰!");
	}
} 
class PrintServiceImpl2 implements PrintService{
	String nameofservice; // service name 
	String nameofserver; // server name 

	public PrintServiceImpl2(String svc, String srv) {
		nameofservice = svc; 
		nameofserver = srv;
		Client.dsp.registerService(nameofservice,this) ; 
	} 

	public void runService() { 
		//test output 
		System.out.println("Service " + nameofservice + " by " + nameofserver); 
		greeting();
	}

	@Override
	public void greeting() {
		// TODO Auto-generated method stub
		System.out.println("Hello!");
	}
} 