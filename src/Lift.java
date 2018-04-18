/*
 * Vinay Shivanna
 */
public class Lift {
	private int id;
	private Floor currentFloor;
	
	public  void move(Floor dst){
				currentFloor = dst;
				System.out.println("Lift door opening at Floor"+currentFloor.getId());
				System.out.println("waiting for people to get in at Floor"+currentFloor.getId());
				System.out.println("Lift door Closing at Floor"+currentFloor.getId());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Floor getCurrentFloor() {
		return currentFloor;
	}

	public void setCurrentFloor(Floor currentFloor) {
		this.currentFloor = currentFloor;
	}
}
