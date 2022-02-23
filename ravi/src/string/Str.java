package string;

public class Str {
public static void main(String[] args) {
	
	String s1= "Vijay dinanath chohan" ;
	System.out.println(s1.length());
		

rev(s1);
revSpl(s1);
coun(s1);	
litPool();
	

}

public static void strOp() {
	/*	System.out.println(i);
	System.out.println(i.toUpperCase());
	System.out.println(i.replace("v","l"));
	System.out.println(i.replaceAll("[a-z]","i"));
	System.out.println(i.indexOf("ay"));
	System.out.println("inof"+i.valueOf(3));
	System.out.println(i.charAt(3));
 for(int j=0; j<i.length();j++ ) {
	 for(int k=0; k<j;k++ ) {
		 System.out.print("*");
	 }System.out.println();
 }
StringBuffer r= new StringBuffer("virujay");
System.out.println(r.reverse());
System.out.println("rcapaci "+r.capacity());
System.out.println(r.replace(0, 2, "jay"));  



System.out.println(Math.max(9,7));
System.out.println(Math.min(5,7));
System.out.println(Math.sqrt(9));
System.out.println();
int a=9;int j=7;
int k=sum(a,j);
System.out.println("addition is"+k);
}
public static int sum(int i,int j) {
	int k=i+j;return(k);
	*/
/*	System.out.println(s1);
	for (int i=s1.length();i>=1;i--) {
		System.out. print(s1.charAt(i-1));
	}*/

}
public static void rev(String s1) {
	System.out.println(s1);
	for (int i=s1.length();i>=1;i--) {
		System.out. print(s1.charAt(i-1));
	}
}
public static void revSpl(String s1) {
	System.out.println();
	String[] str =s1.split(" ");
	for(String s2:str) {
		System.out.println(s2);
	}
	
	for(String s2:str) {
		//System.out.println(s2);
		for (int i=s2.length();i>=1;i--) {
			System.out.print(s2.charAt(i-1));
		}
	}System.out.println();
}
public static void coun(String s1) {
	int p=0;
	System.out.println("count every char=");
		
	 for(int i=0;i<s1.length()-1;i++) {
		for(int j=0;j<s1.length()-1;j++) {
		 if (s1.charAt(i)== s1.charAt(j) ) {
		 p++;
		 }
	}System.out.println(s1.charAt(i)+"="+p);p=0;
}
}
public static void litPool() {
	String s1= "ravi joshi";
	String s2=s1;
System.out.println(s2);

}

}