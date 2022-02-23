package account;

import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.scene.control.DateCell;

public class Person {
  private String name = null;
private String add = null;
private Date d =new Date();
SimpleDateFormat f =new SimpleDateFormat("dd.MM.yy");
String dob= f.format(d);
private int age =00;


public String getadd() {
	return add;
}
public void  setadd(String add ) {
	this.add = add;
}
public String getname (){
return name ;	
	}
public void setname (String name ) {
	this.name =name ;
}
public String getdob() {
	return dob;
}
public void setdob (String dob) {
	this.dob = dob;
}
public int getage (){
	return age;
	}
public void setage(int age ) {
	this.age = age;
}
public static void Else() {

	int marks=80;
	if(marks>=90) {
		System.out.println("GRADE A");
	}
	else if(marks>80) {
	System.out.println("GRADE B+");
	}

	else if(marks>80) {
		System.out.println("GRADE B");
		
		}
		else if(marks>80) {
			System.out.println("GRADE C");
			}
			else {
				System.out.println("GRADE D");
				}
	}
	
	
	
	


}
