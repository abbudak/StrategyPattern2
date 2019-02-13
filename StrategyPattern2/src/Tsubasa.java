
public class Tsubasa extends Player {

	public Tsubasa() {
		kickBehavior = new FirstKick();
	}

	@Override
	public void display() {
		System.out.println("Tsubasa Displayed");
		
	}
}
