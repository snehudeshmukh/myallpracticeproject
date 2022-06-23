package dailypractice;

 class B 
{ 
private void m1()
{ 
 System.out.println("m1-A"); 
 }
public static void main(String[] args) 
{ 
 B b = new B(); 
  b.m1(); 
 }
} 
public class A extends B
{ 
public void m1()
{ 
 System.out.println("m1-B"); 
} 
//public static void main(String[] args) 
//{ 
// B b = new B(); 
//  b.m1(); 
// } 
}