package com.ssafy.day4.abs;


public class VehicleTest {

	public static void main(String[] args) {
		// 여러 가지 운송 수단들을 관리해보자.
		Vehicle[] vehicles = {
				new ElectricCar(),
				new DieselSUV(),
				new HorseCart()
		};
		for(Vehicle v : vehicles) {
			v.addFuel();
			v.reportPosition();
			
//			if(v instanceof ElectricCar) {
//				ElectricCar ev = (ElectricCar)v;
//				ev.addFuel();
//			}
		}
	}
}
