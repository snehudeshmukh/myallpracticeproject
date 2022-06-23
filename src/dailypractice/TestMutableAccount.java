package dailypractice;

public class TestMutableAccount {
public static void main(String[] args) {
	Account acco = new Account("Snehal",1234567,4567);
	Bank bk = new Bank("SBI","TilakNagar",acco);
	System.out.println("Before change:"+bk);
	acco.setName("Sham");
	System.out.println("After Change:"+bk);
}
}
