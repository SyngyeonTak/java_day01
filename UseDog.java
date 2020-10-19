class UseDog{
	public static void main(String[] args){
		//Dog은 개발자가 정의한 기존에 없었던 새로운 자료형이다..
		//이러한 자료형을 가리켜 사용자 정의자료형이라 하고, 모든~ 클래스는 사용자 정의 자료형이다!!
		//Dog의 자료형은 Dog형이다..
		//자바개발자는 세상에 없는, 자료형을 새롭게 정의하므로 마치 조물주와 같다.
		Dog d = new Dog();
		System.out.println("강아지 탄생 성공");
		System.out.println("강아지 이름: "+d.name);
		System.out.println("강아지 색상: "+d.color);
		System.out.println("강아지 나이: "+d.age);
	}
}
