/*
 * 제너릭
 * - 컴파일 시 타입 체크 
 * - 형 변환 하지 않아도 된다.
 * 
 * - 단점 : 타입 갯수 만큼 박스 클래스를 별도로 만들어야 한다.
 */
package com.ssafy.day06;
class Box01{
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	

}
class Box02{
	private Object data;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	/*
	 * 장점 : 여러가지 타입을 하나의 박스로 담을 수 있다.
	 * 단점 : 박스에 담는 타입을 특정 타입만 담을 수 있도록 제한이 불가능, 컴파일 시에 타입 체크가 되지 않아
	 *       런타임 에러가 발생할 수 있다.
	 *       매번 형변환을 사용해서 데이터를 처리해야 한다.
	 */
}
//Box3 <타입 파라미터>
//new Box3<타입인자> 
class Box3<T>{
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	
}
}
public class Test03 {

	public static void main(String[] args) {
		//Box3 is a raw type. References to generic type Box3<T> should be parameterized
		Box3 b3 = new Box3();
		Box3<String> b4 = new Box3<String>();
		Box3 b5 = b4;
		//Type safety: The expression of type Box3 needs unchecked conversion to conform to Box3<String>
		Box3<String> b6 = b5;
//		Box01 b = new Box01();
//		b.setData("안녕");
//		String msg = b.getData();
//		System.out.println(msg);
//		
//		Box02 b2 = new Box02();
//		b2.setData(100);
//		String msg2 = (String) b2.getData(); // 컴파일 ok , 런타임 error
//		System.out.println(msg2);

	}

}
