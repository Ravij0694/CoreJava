package Colle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Alist {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Collection c = new ArrayList();

		c.add("ram");
		c.add("shyam");
		c.add("mohan");
		c.add("sita");
		c.add("gita");
		Iterator it = c.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + ",");
			it.remove();
		}
		System.out.println();
		SortedSet s = new TreeSet();

		s.add("ram");
		s.add("shyam");
		s.add("mohan");
		s.add("sita");
		s.add("gita");
		for (Object s1 : s) {
			System.out.println(s1);
		}

		ArrayList Employ = new ArrayList();

		Employ.add(new Employ("ram", "sharama", 5000));
		Employ.add(new Employ("shyam", "brahman", 9000));
		Employ.add(new Employ("mohan", "agnihotry", 14000));
		Employ.add(new Employ("himanshu", "bumar", 11600));
		Employ.add(new Employ("gita", "cumar", 11600));
		Employ.add(new Employ("gita", "kumar", 11600));
		Employ.add(new Employ("nita", "tumar", 11600));

		Employ e1 = new Employ();
		Collections.sort(Employ, e1);
		for (Object o : Employ) {
			System.out.println(o);
		}

		System.out.println();

		Comsal c1 = new Comsal();
		Collections.sort(Employ, c1);
		for (Object o : Employ) {
			System.out.println(o);
		}

	}
}
