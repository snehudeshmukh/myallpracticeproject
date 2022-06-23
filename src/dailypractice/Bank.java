package dailypractice;

public final class Bank {
private final String bankName;
private final String branchName;
private final Account acco;
Bank(String bankName,String branchName,Account acco){
	this.bankName=bankName;
	this.branchName=branchName;
	Account dummyAcco = new Account();
	dummyAcco.setName(acco.getName());
	dummyAcco.setAccoNo(acco.getAccoNo());
	dummyAcco.setIfscCode(acco.getIfscCode());
	this.acco=dummyAcco;
}
public String getBankName() {
	return bankName;
}
public String getBranchName() {
	return branchName;
}
public Account getAcco() {
	Account dummyAcco1= new Account();
	dummyAcco1.setName(this.acco.getName());
	dummyAcco1.setAccoNo(this.acco.getAccoNo());
	dummyAcco1.setIfscCode(this.acco.getIfscCode());
	return dummyAcco1;
}
@Override
public String toString() {
	return "Bank [bankName=" + bankName + ", branchName=" + branchName + ", acco=" + acco + "]";
}

}
