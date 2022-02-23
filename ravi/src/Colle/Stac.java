package Colle;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Stac {
	public static void main(String []args) {
		Stack l=new Stack();
	     l.add("ram");
	     l.add("shyam");
	     l.add("mohan");
	     l.add("sohan");
	     l.add("gita");
	     l.add("sita");
	     Iterator  i=l.iterator();
	     while (i.hasNext()) {
	    	 System.out.println(i.next());
	     }System.out.println();
	  
	 Stack  l1 = new Stack();
	for(int j=0;j<l.size();j++) {
		l1.push(l.pop());

		System.out.println(l1.peek());}
//	System.out.println(l1);

		}
}
