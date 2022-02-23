package Colle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Cl116 {
public static void main(String []args) {
	HashSet h=new HashSet();
	TreeSet t=new TreeSet();
	LinkedHashSet l= new LinkedHashSet();		
			
		/*
		 * for(int i=0;i<10;i++) { int j= (int )(Math.random()*100); h.add(j); }
		 */
	h.add("ram");
	h.add("shyam");
	h.add("mohan");
	h.add("sohan");
	h.add("ghanshyam");
		t.add("ram");
		t.add("mohan ");
		t.add("sohan");
		t.add("ghanshyam");
		t.add("mahesh");
		l.add("prithamnath");
		l.add("mahindar nath");
		l.add("trivendar nath");
		l.add("dinanath");
		l.add("vishvnath");
		Iterator i= t.iterator();
		System.out.println("TreeSet\t");
		while (i.hasNext()) {
			System.out.print(i.next()+",");
		
		}System.out.println();
			System.out.println("HeshSet\t");
		Iterator i1= h.iterator();
		while (i1.hasNext()) {
			System.out.print(i1.next()+",");
		
		}
		System.out.println();
		System.out.println("linkedHS\t");
		Iterator i2= l.iterator();
		while (i2.hasNext()) {
			System.out.print(i2.next()+",");
		
		}	
			
			
			
			
			
			
			
		
}
}
