package com.ssafy.day4.inter;

public class IronMan extends Person implements Heroable{

	@Override
	public void upgrade() {
		System.out.println("레벨업!!!");
		
	}

	@Override
	public void fire() {
		System.out.println("로켓 발사!!");
		
	}

	@Override
	public void changeShape(boolean isHeroMode) {
		System.out.println("변신!!!");
		
	}
}
