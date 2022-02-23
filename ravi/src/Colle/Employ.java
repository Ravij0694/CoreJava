package Colle;

import java.util.Comparator;

public class Employ implements Comparator<Employ> {
protected String name =null;
protected String lname=null;
protected int sal=00;
public Employ () {}
public Employ (String s ,String s1,int i) {
	this.name=s;
	this.lname=s1;
	this.sal=i;
}
public int compare(Employ e,Employ e2) {
    int i= e.name.compareTo(e2.name);
    if (i==1)return 1;
    else if(i==0){
	        return e.lname.compareTo(e2.lname);
    }else return -1;
}
public String toString() {
	return name+" "+lname+","+sal;
}


public boolean equals(Object o ) {
	if (o==null)return false;
	if (!(o instanceof Employ))return false;
	Employ op=(Employ)o;
	return this.name.equals(op.name);
}
public int hashCode() {
	return name.hashCode();
}

}
 


class Comsal implements Comparator<Employ> {
public int compare(Employ e,Employ e2) {
	if (e.sal>e2.sal) {return 1;}
	else if (e.sal==e2.sal)return 0;
	else return - 1;
}
}
