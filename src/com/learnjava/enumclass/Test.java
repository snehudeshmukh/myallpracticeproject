package com.learnjava.enumclass;



enum Day {
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;//enum defined outside the class
}
public class Test {
	Day day;
	public Test(Day day) {
		this.day=day;
	}
	public void dayIsLike() {
		switch(day) {
		case MONDAY:
			System.out.println("monday are Bad");
			break;
		case FRIDAY:
			System.out.println("Fridays are better");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are best");
			break;
		default:
			System.out.println("Midweek day are so-so");
		}
	}
public static void main(String[] args) {
	//String str= "MONDAY";
	Test t1= new Test(Day.valueOf("SUNDAY"));//valueOf method used
	t1.dayIsLike();
	//Day[] enumArray =Day.values();//Arrays of an using enum
	//for(Day day: enumArray) {
	for(Day day:Day.values())//direct array print using for loop and values method
		System.out.println(day);
}
}