package array;

public class Rarray {
public static void main(String[] args) {
	
	
	System.out.println("array copy");
	char [] a = {'a','b','f','g','l','k'};
	char [] b =  new char [5];
	System.out.println(a);
	System.arraycopy(a,0,b,0,4);
	System.out.println( b);
	
	
	int[] i= {3,5,4,2,6,9,11};
    int [] j =  new int [5];
	for (int f:i) {System.out.print(f);}
	System.arraycopy(i,0,j,0,5);                                                
	System.out.println();                      
	for(int e:j) {System.out.print(e);}
	System.out.println();
		
	int c=10;
	int [][] k= new int[10][9];
	int n=10;int o=8;
	
	
	
	//max (n,o);
	//min(n,o);
	//rendom(n);
	// fect(c);
	//revInt(n);
	 //febo(c);
	//divBy7();
	//tableByarray(k);
	//star(n);
	//arm(n);
	//prime(n);
	//pelin(n);
	//har(n);
	//oddEven(n);
	 //greByforeach(i);
	//secGreter(i); 
	//missing(i,j);
	//digit(n,i);	 
	
	  //tableByloop();



      }

public static void secGreter(int []g) {System.out.println();
	int x =g[0];int f=0;
	for(int i=0;i<g.length;i++){
		if(g[i]>x) {
			 f=x;
			x=g[i];
		}else if(g[i]>f){f=g[i];}
	}
	System.out.println("2greter value by for is=="+f);
}

public static void greByforeach(int[] g) {int x=g[0];
	for(int h: g) {
		if (h>x) {
			x=h;
			
		}
		System.out.println("greter value by for each="+x);
	}System.out.println("greter value by for each="+x);
}
public static void tableByloop() {
	System.out.println();
	System.out.println("useing loop print table");

	for(int x=1;x<=10;x++) {
		 System.out.println();
		 for(int z=2;z<=10;z++) { 
			 int y=z*x;
			 System.out.print(y+"\t");
		 }
	 }
}
public static void tableByarray(int [][] k) {
	System.out.println();
	System.out.println("useing array print table");
	for (int c=0 ;c<k.length;c++) {
		System.out.println();
		for (int d=0; d<k[c].length;d++) {
			k[c][d]=(c+1)*(d+2);
			System.out.print(k[c][d]+"\t");
		}
		}
	
}
public static void missing(int[] i,int[] j) {int k=0;int l=0;
	for (int a:i) {
		k+=a;
	}
	for(int b:j) {
		l+=b;
	}int m=k-l;System.out.println("missing val"+m);
}
public static void febo(int j) {int a =0 ; int b=1;int c;
System.out.println("febo serise is");
	for (int i=1;i<j;i++) {
c=a+b;System.out.print(c+",");
a=b;
b=c;

	}
}
public static void fect(int j) {int k=1; 
	for (int i=1;i<j;i++) {
		System.out.print(k+"*"+i);k*=i;System.out.println("="+k);
	}
}
public static void arm(int n) {
	int l=n;int r=0;
	for(int i=0;n!=0;i++) {
		int d=n%10;
		r+= d*d*d;
		n/=10;
	}if (r==l) {System.out.println(l+" "+"no is arm Strong");}
	else {System.out.println("Not arm");}
}
public static void divBy7() {
	int f=0;
	 System.out.println();
	System.out.println("beetwin 100&200 div by 7");
	for(int e=100;e<=200;e++) {
		if( e%7==0) {
           System.out.println(e);
			f+=e;
		}
	}
	System.out.println("sum of all no = "+f);

}
public static void pelin(int n) {
	int l=n;int r=0;
	for (int i=0;n>0;i++) {
		int d=n%10;
		 r=d+(r*10);
		 n/=10;
	}System.out.println("pielindron no is "+r);
}
public static void star(int i) {
	for(int j=0; j<i;j++ ) {
		 for(int k=0; k<j;k++ ) {
			 System.out.print("*");
		 }System.out.println();
	 }
}
public static void prime(int n) {
 for (int i=2; i<=n/2;++i) {int t=0;
	if (n%i==0) {
		
		t=1; break;
	 
 }if (t==0) {System.out.println("not even ");}
	
	else{System.out.println("its A prime no");
}
}
}
public static void oddEven(int j) {
	int k=0;int l=0;int t=0;int r=0;int s=0;
	for (int i=1; i<j; i++) {
		if(i%2==0) {
			++r;
			k+=i;
		    System.out.println("even"+i);
		}else {
			++s;
			t+=i;
			System.out.println("odd "+i);}
	}System.out.println("total= "+k+" & avg of even is  "+k/r);
	System.out.println("total="+t+"  & avg of odd is  "+t/s);
	}
public static void revInt(int n) {
	int l=n;int r=0;
	for (int i=0;n>0;i++) {
		int d=n%10;
		 r=d+(r*10);
		 n/=10;
	}System.out.println("revarse digit of "+r);
	
}

public static void rendom(int n) {
	System.out.print("revars digt is =");
	for (int i=0;i<n;i++) {
		System.out.print((int)(Math.random()*100));
	System.out.print(",");
	}
}
public static void max(int n,int o) {
	if (n>o) {
		System.out.println("max value is "+n);
	}else {System.out.println("max value is "+o);}
}
public static void min(int n,int o) {
	if (n<o) {
		System.out.println("min value is "+n);
	}else {System.out.println("min value is "+o);}
}
public static void digit(int n,int []b) {
		int k=0;
	for(int i=0;i<b.length;i++) {
		if (n==b[i]) {
			k++;
		System.out.println("position "+n+"at ="+(i+1));
		}
    }
	if (k==0) {System.out.println("-1");}
	}
public static void har(int n) {
	int i = 2;
	float d=1;
	System.out.print("1+");
	for (int j=2;j<n+1;j++) {
		System.out.print("1/"+j+"+");
		}
	System.out.println();
	while(i<n+1) {
		d +=(float)1/i;
	i++;
	System.out.print(d+",");
	}
}}


