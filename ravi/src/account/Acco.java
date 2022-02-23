package account;

public  class Acco {
private String accNo = null;
private String  accType = null;
private Double bal = 0.00;




public  Acco() {}
public  Acco(String s,String t,double d) {
	this.accType=t;
	this.accNo=s;
	this.bal=d;
}
public String  getAccNo() {
return accNo;
}
public  String getAccType() {
	return accType;
}
public Double  getBal() {
	return bal;
}
public void setAccNo(String no) {
	this.accNo = no;
}
public void setAccType(String account) {
	this.accType= account;
}
public void setBal(Double bal) {
	this.bal=bal;
}
public void withdrawal(double i) {
	double d=getBal();
	try{
		if (d-500<i) {
			unsufficiantException e = new unsufficiantException();
			throw e;
		}
		else d-=i;
	setBal(d);
	}catch(Exception e) {System.out.println("unsufficiant bal");}
		
	
}
public void deposit(int i) {
	double d=getBal();
	d+=i;
	setBal(d);
}
public void fundTra(String s,double b) {
   withdrawal(b);
   
} 
}
class unsufficiantException extends Exception {
	public unsufficiantException() {
		super("unsuffi");
	}
}
