package ch09_gamelevel_1021;

public class UltraLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("눈에 보이지 않게 달립니다.");		
	}

	@Override
	public void jump() {
		System.out.println("하늘 높이 점프합니다");			
	}

	@Override
	public void turn() {
		System.out.println("720도 턴을 합니다");		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** 궁극의 레벨 입니다. *****");
		
	}
	
	@Override
	public void ult() {
		System.out.println("필살기!");		
	}

}
