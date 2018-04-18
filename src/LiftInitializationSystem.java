import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * @author vinay.shivanna
 *
 */
public class LiftInitializationSystem {
	
	private static LiftInitializationSystem instance;
	
	private LiftInitializationSystem (){
		
	}
	
	public static LiftInitializationSystem getInstance(){
		if(instance == null){
			synchronized(LiftInitializationSystem.class){
				instance = new LiftInitializationSystem();
			}
		}
		return instance;
	}
	
	public void initialize(int numOfLift,int numOfFloor){
		List<Floor> floorList = new ArrayList<Floor>();
		Set<Lift> emptyliftSet = new HashSet<Lift>();
		Set<Lift> liftSet = new HashSet<Lift>();
		for(int i=0; i < numOfLift; i++){
			Lift lift = new Lift();
			liftSet.add(lift);
		}
		Floor fisrtFloor = null;
		for(int i = 0 ; i < numOfFloor ; i++){
			Floor floor;
			if(i ==0 ){
				floor = new Floor(i,liftSet);
				fisrtFloor = floor;
			}
			else{
				floor = new Floor(i,emptyliftSet);
			}
			floorList.add(floor);
		}
		for(Lift lift: liftSet){
			lift.setCurrentFloor(fisrtFloor);
		}
		LiftManagementSystem.getInstance().setFloorList(floorList);
	}
}
