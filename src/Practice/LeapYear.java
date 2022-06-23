package Practice;

public class LeapYear {
	public static void main(String[] args) {
		
int year= 1996;
if((year%400==0)|| (year%4==0 && year%100!=0)) {
	System.out.println("Leap Year");
	
}
else 
	System.out.println("Not a leap year");
}
}
//two condition mdhun one will satisfy year%400
//or year%4 but not divided by 100