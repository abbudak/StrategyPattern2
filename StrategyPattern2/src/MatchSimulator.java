
public class MatchSimulator {

	public static void main(String[] args) {
		
		Player player1 = new Tsubasa();
		
		player1.display();
		player1.doPlay();
		player1.setPlayBehavior(new SecondKick());
		player1.doPlay();
		player1.setPlayBehavior(new ThirdKick());
		player1.doPlay();
		player1.setPlayBehavior(new FourthKick());
		player1.doPlay();
	}

}
