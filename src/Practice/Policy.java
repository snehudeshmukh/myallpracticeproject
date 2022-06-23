package Practice;

import java.util.Scanner;

public class Policy {
private static final Policy Policy = null;
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the policyId");
	int policyId=sc.nextInt();
	System.out.println("Enter policy name");
	String policyName=sc.next();
	System.out.println("Enter Policy Type");
	String policyType=sc.next();
	System.out.println("Enter Premium amount");
	int premiumAmo=sc.nextInt();
	Policy po=new Policy();
	po.getPolicyDetails(policyId,policyName,policyType,premiumAmo);

}
	public  Policy getPolicyDetails(int id,String policyName,String type,int amo) {
		System.out.println("Policy Id:"+id);
		System.out.println("Policy Name:"+policyName);
		System.out.println("Policytype:"+type);
		System.out.println("Amount of premium:"+amo);
		
		
		return Policy;
	}

}
