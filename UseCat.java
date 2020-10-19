class UseCat{
	public static void main(String[] args){
		Cat c = new Cat();
		System.out.println("고양이 생성");
		System.out.println("고양이 이름: "+c.name);
		System.out.println("고양이 나이: "+c.age);
		System.out.println("고양이 결혼여부: "+c.married);
		System.out.println("고양이 걷는 동작: "+c.walk());
		System.out.println("고양이 우는 동작: "+c.meow());
	}
}
