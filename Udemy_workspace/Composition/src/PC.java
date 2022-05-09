/* Here we can see that in PC class we are using 3 components (i.e, Motherboard, Monitor, Case). If we use inheritance than at a time only one class we 
 * can inherit. But by using composition PC Has A relationship with these components.
 */
public class PC {
	private Case theCase;
	private Monitor monitor;
	private MotherBoard motherboard;
	
	public PC(Case theCase, Monitor monitor, MotherBoard motherboard) {
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}
	
	public void powerUp() {
		getTheCase().pressPowerButton();
		drawLogo();
	}
	
	private void drawLogo() {
		monitor.drawPixelAt(1200, 50, "yellow");
	}

	private Case getTheCase() {
		return theCase;
	}

	private Monitor getMonitor() {
		return monitor;
	}

	private MotherBoard getMotherboard() {
		return motherboard;
	}
}
