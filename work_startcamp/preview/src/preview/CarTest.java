package preview;

public class CarTest {

	public static void main(String[] args) {
		Driver kim = new Driver();
		kim.name = "이하림";
		
		System.out.println(kim.name + "이 운전합니다.");
		kim.driving();

	}

}
