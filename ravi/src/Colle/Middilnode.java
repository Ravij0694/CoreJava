package Colle;

import java.util.Iterator;
import java.util.LinkedList;

public class Middilnode {
public static void main(String []args) {
	LinkedList l=new LinkedList();
     l.add("ram");
     l.add("shyam");
     l.add("mohan");
     l.add("sohan");
     l.add("gita");
     l.add("sita");
     Iterator  i=l.iterator();
     while (i.hasNext()) {
    	 System.out.println(i.next());
     }
   int a=l.size();
   System.out.println("middil node is :"+l.get(a/2)); 
     
   LinkedList  l1 =new LinkedList();
for(int j=0;j<l.size();j++) {
	l1.push(l.pop());

	System.out.println(l1.pop());}

	}

}
