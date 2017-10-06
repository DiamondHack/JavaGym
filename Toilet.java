
public class Toilet {
	private int numToilets;
	private int numShowers;
	private int numDryers;
	private int numSinks;

	public Toilet() {
		numToilets = 0;
		numShowers = 0;
		numDryers = 0;
		numSinks = 0;
	}
	
	public void setToilNum(int a){
		numToilets = a;
	}
	
	public int getToilNum() {
		return numToilets;
	}
	
	public void setShowerNum(int a) {
		numShowers = a;
	}
	
	public int getShowersNum() {
		return numShowers;
	}
	
	public void setDryerNum(int a)
	{
		numDryers = a;
	}
	
	public int getDryerNum(){
		return numDryers;
	}
	
	public void setSinksNum(int a) {
		numSinks = a;
	}
	
	public int getSinksNum(){
		return numSinks;
	}
}
