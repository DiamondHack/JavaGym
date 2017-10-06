
public class Lobby {
	private Locker lock;
	private Toilet toil;
	private Reception rec;
	private Changing change;
	
	public Lobby()
	{
		lock = new Locker();
		toil = new Toilet();
		rec = new Reception();
		change = new Changing();
	
	}
	
		public void setLocker(Locker a){
			lock = a;
		}
		public Locker getLocker() {
			return lock;
		}
		
		public void setToilet(Toilet a){
			toil = a;
		}
		public Toilet getToilet()
		{
			return toil;
		}
		public void setReception(Reception a){
			rec = a;
		}
		public Reception getReception()
		{
			return rec;
		}
		
		public void setChanging(Changing a){
			change = a;
		}
		public Changing getChanging() {
			return change;
		}
}
