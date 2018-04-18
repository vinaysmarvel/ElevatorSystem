import java.util.List;

public class LiftManagementSystem {
	
	private static LiftManagementSystem instance;
	private List<Floor> floorList;
	
	private LiftManagementSystem (){
		
	}
	
	public static LiftManagementSystem getInstance(){
		if(instance == null){
			synchronized(LiftManagementSystem.class){
				instance = new LiftManagementSystem();
			}
		}
		return instance;
	}
	
	
	public List<Floor> getFloorList() {
		return floorList;
	}

	public void setFloorList(List<Floor> floorList) {
		this.floorList = floorList;
	}

	public static void setInstance(LiftManagementSystem instance) {
		LiftManagementSystem.instance = instance;
	}

	public Lift request(Floor floorId) {
		Lift closestLift = null;
		for (Floor floor : floorList) {
			for (Lift lift : floor.getCurrentLiftSet()) {
				if (floorId.getId() == floor.getId()) {
					closestLift = lift;
				} else {
					if (closestLift == null || (Math.abs(closestLift.getCurrentFloor().getId() - floorId.getId()) < Math
							.abs(floorId.getId() - floor.getId()))) {
						closestLift = lift;
					}
				}
			}
		}
		closestLift.move(floorId);
		return closestLift;
	}
}
