package nivel21;

public class Cycle {
	
	protected int wheelsNum;
	
	public Cycle(int wheelsNum) {
		this.wheelsNum = wheelsNum;
	}
	
	public void ride () {
		System.out.println("Ride de cycle");
		System.out.println("Wheel numbers: " + wheels());	
	}
	
	public int wheels() {
		return wheelsNum;
	}

}
