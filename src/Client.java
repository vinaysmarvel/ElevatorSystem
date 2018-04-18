
public class Client {
	
	public static void main(String[] args) {
		
		LiftInitializationSystem.getInstance().initialize(3, 5);
		Lift lift = LiftManagementSystem.getInstance().getFloorList().get(3).request();
		lift.move(LiftManagementSystem.getInstance().getFloorList().get(4));
	}
}
