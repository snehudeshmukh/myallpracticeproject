package aggregation;

public class Info {
	public static void main(String[] args) {
		Address a1= new Address(102,"Pune","Maharastra",110224);
		Address a2 =new Address(103,"Pune","Maharastra",122334);
		Student s1 =new Student(10,"Rohini",a1);
		Student s2 =new Student(20,"Ram",a2);
		
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
