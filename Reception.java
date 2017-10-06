
public class Reception {
	private int numTurnstyle;
	private int numStaff;
	private int numDesks;
	private int numComputers;
	
	public Reception() {
		numTurnstyle = 0;
		numStaff = 0;
		numDesks = 0;
		numComputers = 0;
	}
	public void setTurnstyleNum(int a){
		numTurnstyle = a;
	}
	
	public int getTurnstyleNum() {
		return numTurnstyle;
	}
	
	public void setStaffNum(int a) {
		numStaff = a;
	}
	
	public int getStaffNum() {
		return numStaff;
	}
	
	public void setDeskNum(int a)
	{
		numDesks = a;
	}
	
	public int getDeskNum(){
		return numDesks;
	}
	
	public void setComuterNum(int a) {
		numComputers = a;
	}
	
	public int getComputerNum(){
		return numComputers;
	}
}


