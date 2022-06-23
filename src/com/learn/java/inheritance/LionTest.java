package com.learn.java.inheritance;
class Animal{
	void food() {
		System.out.println("What kind of food lions eat");
	}
	
}
class Lion extends Animal {
	void food(int x) {
		System.out.println("Lions eat Flesh");
	}
}
	public class LionTest {
		public static void main(String[] args) {
			Animal a = new Lion();//jar parent class cha reference asla tar only parent class mdhe aslelya method call honar
			a.food();
			//a.food(20);//parent chya reference mdhe cant call child class method error yenar
			Lion i= new Lion();
			i.food();//method implement nahi keli tari inherited kela tarr parent class chya all method child class mdhe yetat automatic with same behaviour of parent class
			i.food(10);//reference of class Lion ti method present ahe mnun call honar
		}
}


