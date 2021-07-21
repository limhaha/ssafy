package preview;

public class Car {
	public String name;
	private int currentSpeed;
	public int currentGear;
	
	public void startEngine() {
		System.out.println("-> " + name + "의 시동을 켠다.");
		currentSpeed=1;
		
	}
	
	public void changeGear(int gear) {
		System.out.println("-> 기어를 " + gear + "단으로 변경한다.");
		currentGear = gear;
	}
	
	public int getCurrentSpeed() {
		currentSpeed = currentSpeed + (currentGear * 10);
		return currentSpeed;
	}
	
	public void stopEngine() {
		System.out.println("-> " + name +"의 시동을 끈다.");
		currentSpeed = 0;
		currentGear=0;
	}
	
	public String getCurrentState() {
		return name + "의 현재 속도 : " + getCurrentSpeed();
	}
}
