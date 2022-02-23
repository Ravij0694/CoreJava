
package gen;

import java.util.ArrayList;
import java.util.Collection;

public class lru {
	public static void main(String[] args) {

		Data<String, Integer> d = new Data<String, Integer>("ram", 01);
		d.show();
		System.out.println(d.getkey());
		System.out.println(d.getval());

		ArrayList<String> l = new ArrayList<String>();
		l.add("ram");
		l.add("gita");
		l.add("sohan");
		l.add("mohan");
		l.add("shyam");
		System.out.println(l);
		changPo(l, 2, 3);
		System.out.println(l);

		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(98);
		l1.add(75);
		l1.add(67);
		l1.add(82);
		l1.add(90);
		max(l1, 70, 90);
	}

	public static <l> void changPo(ArrayList<String> l, int i, int j) {

		String s = l.get(i);
		String s1 = l.get(j);
		l.remove(i);
		l.remove(i);
		l.add(i, s1);
		l.add(j, s);
	}

	public static void max(ArrayList<Integer> l, int i, int j) {
		int b = 0;
		for (int k = 0; k < l.size(); k++) {
			int m = l.get(k);
			if (m > i && m < j) {
				if (m > b) {
					b = m;
				}
			}
		}
		System.out.println("max val beetwin" + i + "to" + j + "=" + b);
	}

}

class Data<k, v> {
	k key;
	v val;

	public Data(k k, v v) {
		this.key = k;
		this.val = v;
	}

	k getkey() {
		return key;
	}

	v getval() {

		return val;
	}

	void show() {
		System.out.println(key.getClass().getName());
		System.out.println(val.getClass().getName());
	}

}