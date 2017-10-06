
public class Machines {
	private int numLegMachines;
	private int numChestMachines;
	private int numBackMachines;
	private int numShoulderMachines;
	private int numAbsMachines;
	
	public Machines() {
		numLegMachines = 0;
		numChestMachines = 0;
		numBackMachines = 0;
		numShoulderMachines = 0;
		numAbsMachines = 0;
		
	}
	
	public void setLegNum(int a) {
		numLegMachines = a;
	}
	
	public int getLegNum() {
		return numLegMachines;
	}
	
	public void setChestNum(int a) {
		numChestMachines = a;
	}
	
	public int getChestNum() {
		return numChestMachines;
	}
	
	public void setShoulderNum(int a) {
		numShoulderMachines = a;
	}
	
	public int getShoulderNum() {
		return numShoulderMachines;
	}
	
	public void setAbsNum(int a) {
		numAbsMachines = a;
	}
	public int getAbsMachines() {
		return numAbsMachines;
	}
	
}
