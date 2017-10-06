
public class Basketball extends Courts {
	
	private int numHoops;
	
	public Basketball() {
		width = 24;
		length = 28;
		
		numHoops = 2;
	}
	
	public void setNumHoops(int a) {
		numHoops = a;
	}
	
	public int getNumHoops() {
		return numHoops;
	}
}
