
public class Cardio {
	private int numTreadmills;
	private int numCrosstrainers;
	private int numBikes;
	
	public Cardio() {
		numTreadmills = 0;
		numCrosstrainers = 0;
		numBikes = 0;
	}
	
	public void setTreadNum(int a) {
		numTreadmills = a;
	}
	
	public int getTreadNum() {
		return numTreadmills;
	}
	
	public void setCrossNum(int a) {
		numCrosstrainers = a;
	}
	
	public int getCrossNum() {
		return numCrosstrainers;
	}
	
	public  void setBikeNum(int a) {
		numBikes = a;
	}
	
	public int getBikesNum() {
		return numBikes;
	}
	
}
