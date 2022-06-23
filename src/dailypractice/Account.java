package dailypractice;

public class Account {
	String name;
	int accoNo;
	int ifscCode;
	Account(){
		
	}
Account(String name,int accoNo,int ifscCode){
	this.name=name;
	this.accoNo=accoNo;
	this.ifscCode=ifscCode;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
public int getAccoNo() {
	return accoNo;
}
public void setAccoNo(int accoNo) {
	this.accoNo = accoNo;
}
public int getIfscCode() {
	return ifscCode;
}
public void setIfscCode(int ifscCode) {
	this.ifscCode = ifscCode;
}
public String toString() {
	return this.name+" "+this.accoNo+" "+this.ifscCode;
}
}
