
public class Master {
	
	private int slaveCount = 10;
	private int sum;
    private Slave[] slaves = new Slave[slaveCount];
    public Master() {
    	this.sum = 0;
    }
    public void run() {
   	  // create slaves:
      for(int i = 0; i < slaveCount; i++) {
         slaves[i] = new Slave(i*10+1);
      }
      // start slaves:
      for(int i = 0; i < slaveCount; i++) {
         slaves[i].start();
      }
      // wait for slaves to die:
      for(int i = 0; i < slaveCount; i++) {
         try {
        	 this.sum += slaves[i].getSum();
             slaves[i].join();
         } catch(InterruptedException ie) {
               System.err.println(ie.getMessage());
         } finally {
            System.out.println(slaves[i].getName() + " has died");
         }
      }
	  System.out.println("Total Sum : "+this.sum);
      System.out.println("The master will now die ... ");
   }
}