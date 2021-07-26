// ##DELETE_FILE:
package com.ssafy.day3.extend.person;

//Person을 상속받는다 
public class SpiderMan extends Person {

	// 고유의 속성, 기능 정의
	boolean isSpider;

	//has a 관계 
	Spider spider = new Spider();
	
	public void fireWeb() {
		if (isSpider) {
			//객체 활용 
			spider.fireWeb();
		} else {
			System.out.println("사람은 거미줄 못쏘지...");
		}
	}
	
	//재정의 
	@Override // annotation
	public void jump() {
		if(isSpider) {
			spider.jump();
		}else {
//			System.out.println("두 다리로 폴짝");
			//조상의 코드 재사용 
			super.jump();
		}
	}

	@Override
	public String toString() {
		return "SpiderMan [isSpider=" + isSpider + ", spider=" + spider + ", name=" + name + "]";
	}
	
	

}