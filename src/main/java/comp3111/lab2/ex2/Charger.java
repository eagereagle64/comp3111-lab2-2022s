package comp3111.lab2.ex2;
/* ABC is pure virtual function */
interface Chargeable{
	public void charge();
}

public class Charger {
	public void charge(Chargeable c) {
		c.charge();
	}
}
