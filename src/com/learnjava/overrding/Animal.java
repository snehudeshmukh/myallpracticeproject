package com.learnjava.overrding;

class S {
	void m1(Animal a) {
		System.out.println("Both Cat And Dog are pets");
	}
}
	class Dog extends S {
		void m1 (Animal a) {
			System.out.println("Only Dog is Pet");
		}
	}
		class Cat extends Dog {
			void m1 (Animal a) {
				System.out.println("Cat is also pet animal");
			}
}
public class Animal {
public static void main(String[] args) {
	S a = new Cat();//object null jari asla tari jyacha object run time tyachi method call honar
	a.m1(null);
	Dog d= new Dog();
	d.m1 (null);
   //Cat c= (Cat)a;//output yenar cat class method run
	Cat c= (Cat)new S();//output ClasCastExcption
	c.m1(null);
	
}
}
