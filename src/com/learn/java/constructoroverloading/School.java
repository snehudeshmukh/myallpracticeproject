package com.learn.java.constructoroverloading;

public class School {
	String scName;
	int scRoll;
	School(){
		scName="Ram";
		scRoll=10;
	}
School(String name){
	scName=name;
}
School(String name, int roll){
	scName=name;
	scRoll=roll;
}
void display() {
	System.out.println(scName+" "+scRoll);
}
public static void main(String[] args) {
	School sc= new School();
	School sc1=new School ("Sham");
	School sc2= new School("Dham",30);
	sc.display();
	sc1.display();
	sc2.display();
}
}
