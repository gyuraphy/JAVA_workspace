package ch05_test_1205;

public class FishBread {
	private String powder; // 반죽
	private String redBean; // 팥
	
	// 실제 데이터에 접근을 하는 방법
	// 직접 접근 할 것인가?, set/get 라는 메서드를 이용할 것인가?
	// case 1 : 직접 접근 객체명.변수
	// case 2 :getPoder() 메서드로 접근.
	// 자동으로 해당 멤버들에 대해서 set/get 을 자동으로 만들었음.
	
	public String getPowder() {
		return powder;
	}
	public void setPowder(String powder) {
		this.powder = powder;
	}
	public String getRedBean() {
		return redBean;
	}
	public void setRedBean(String redBean) {
		this.redBean = redBean;
	}
	
	public void showInfo() {
		System.out.println("현재 반죽은 : " + powder + ", 현재 팥은 : " + redBean);
	}
}
