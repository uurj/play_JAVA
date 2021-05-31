package com.work.interface_test;

public class InterfaceTest {

	public static void main(String[] args) {
		
		// Pet pet = new Pet(); 추상클래스는 직접 객체 생성 불가
		Pet[] pets = new Pet[5]; // 부모타입의 다형성 반영한 변수 사용 가능
		pets[0] = new Dog();
		pets[1] = new Cat();
		pets[2] = new Dog();
		pets[3] = new Cat();
		pets[4] = new Dog();
		
		for (Pet p : pets) {
			p.eat();
		}
		
		// pets[0].name = "코코"; // 인터페이스의 멤버변수는 자동으로 상수처리되기 때문에 변경불가
		System.out.println(Pet.name); // 이렇게 출력해야함 클래스명사용해서
		for (Pet p : pets) {
			System.out.println(p.name);
		}

	}
}

/** 인터페이스의 부모 */
interface Animal {
	public void sleep();
	
}

/** 부모 인터페이스 : 부모인터페이스 자식인터페이스 관계 : 인터페이스끼리는 상속(extends) 관계 */
interface Pet extends Animal {
	public String name = "식식이";
	
	public void eat(); 
	public abstract void speak();
	public abstract void song();
	
}

/** 자식 클래스 */
class Dog implements Pet {

	@Override
	public void eat() {
		System.out.println("사료를 맛나게 먹습니다.");
	}

	@Override
	public void speak() {
		System.out.println("멍멍 말을 합니다.");
	}
	
	@Override
	public void song() {
		
	}

	@Override
	public void sleep() {
		
	}
	
	
}

/** 자식 클래스 */
class Cat implements Pet {

	@Override
	public void eat() {
		System.out.println("츄르를 맛나게 먹습니다.");
	}

	@Override
	public void speak() {
		System.out.println("야옹 말을 합니다.");
	}
	
	@Override
	public void song() {
		
	}
	
	@Override
	public void sleep() {
		
	}
}
