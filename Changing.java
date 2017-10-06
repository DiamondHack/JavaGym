
public class Changing {
	private int numBenches;
	private int numMirrors;
	private int numHangers;
	
	public Changing() {
		numBenches = 0;
		numMirrors = 0;
		numHangers = 0;
	}
	
	public void setBenchesNum(int a) {
		numBenches = a;
	}
	
	public int getBenchesNum(){
		return numBenches;
	}
	
	public void setMirrorsNum(int a){
		numMirrors = a;
	}
	
	public int getMirrorsNum(){
		return numMirrors;
	}
	
	public void setHangersNum(int a) {
		numHangers = a;
	}
	
	public int getHangersNum() {
		return numHangers;
	}
}