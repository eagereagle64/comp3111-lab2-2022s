package comp3111.lab2.ex2;

/* Solution: add 'implements Chargeable' after 'extends Computer' */
/* Reason: MobileComputer.charge() now overrides the method-less interface */

public class MobileComputer extends Computer implements Chargeable {
	private int battery;
	public MobileComputer() {
		secret = "MobileComputer secret";
		battery = 5;
	}
	@Override
	public void work() {
		if (battery > 0) {
			System.out.println("It is working on my lap.");
			battery -= 1;
		} else {
			System.out.println("Running out of battery");
		}
	}
	public void charge() {
		if (battery < 10)
			battery++;
		System.out.println("Charging this mobile computer"); 
	}
}
