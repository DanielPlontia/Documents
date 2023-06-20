class Slave extends Thread {
	private boolean done = false;
	private int sum;
	private int startPoint;
	public Slave(int startPoint) {
		this.startPoint = startPoint;
		this.sum = 0;
	}
	public void halt() {
		done = true;
	}
	protected boolean task(int startPoint) {
		for (int i=startPoint; i<startPoint+10; i++) {
			this.sum += i;
		}
		System.out.println(this.getName()+": "+startPoint+" to "+(startPoint+9)+" add : "+sum);
		return true;
	}
    public void run() {
      while(!done) {
         done = task(startPoint);
		 // be cooperative:
         try {
			 Thread.sleep(1000);
		 } // sleep for 1 sec.
         catch(Exception e) {}
      }
   }
	public int getSum() {
		return this.sum;
	}
}