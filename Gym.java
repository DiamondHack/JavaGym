
public class Gym {
	private Lobby lob;
	private CourtsArea court;
	private WorkoutArea area;
	public Gym()
	{
		lob = new Lobby();
		court = new CourtsArea();
		area = new WorkoutArea();
	}
	
	public void setLobby(Lobby a) {
		lob = a;
	}
	public Lobby getLobby() {
		return lob;
	}
	
	
	public void  setCourts(CourtsArea a) {
		court = a;
	}
	public CourtsArea getCourts() {
		return court;
		
	}
	
	public void setWorkoutArea(WorkoutArea a)
	{
		area = a;
	}
	public WorkoutArea WorkoutArea()
	{
		return area;
	}
}
