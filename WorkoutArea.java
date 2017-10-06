
public class WorkoutArea {
	private Machines machines;
	private Weights weights;
	private Cardio cardio;
	
	public WorkoutArea(){
		machines = new Machines();
		weights = new Weights();
		cardio = new Cardio();
	}
	
	public void setMachines(Machines a){
		machines = a;
	}
	public Machines getMachines() {
		return machines;
	}
	
	public void setWeights(Weights a){
		weights = a;
	}
	public Weights getWeights() {
		return weights;
	}
	
	public void setCardio(Cardio a){
		cardio = a;
	}
	public Cardio getCardio()
	{
		return cardio;
	}
}
