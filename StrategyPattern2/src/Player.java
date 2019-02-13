
public abstract class Player {
	KickBehavior kickBehavior;
	
	public Player() {}
	
	public void doPlay() {
		kickBehavior.Kick();
	}
	public void setPlayBehavior(KickBehavior kb) {
		kickBehavior = kb;
	}
	
	public abstract void display();
}
