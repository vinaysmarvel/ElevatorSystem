import java.util.Set;

/*
 * Vinay Shivanna
 */
public class Floor {
	private int id;
	private Set<Lift> currentLiftSet;
	
	public Floor(int id,Set<Lift> currentLiftSet){
		this.id = id;
		this.currentLiftSet = currentLiftSet;
	}
	
	public Lift request(){
		return LiftManagementSystem.getInstance().request(this);
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<Lift> getCurrentLiftSet() {
		return currentLiftSet;
	}

	public void setCurrentLiftSet(Set<Lift> currentLiftSet) {
		this.currentLiftSet = currentLiftSet;
	}
	
}
