package string;

import java.io.IOException;

public class Calcu {
	
	public static void main(String[] args) throws IOException {
		int k;
		
		System.out.println("enter a =aadition,s=substrect,m= multiplication,d=divition ");
		char c=(char)System.in.read();
	
		int a= Integer.parseInt (args[0]);
		int b= Integer.parseInt (args[1]);
		if(c=='a') {
		k =	add(a,b);
		System.out.println(k);
		} else if(c=='s'){
			k= sub(a,b);
			System.out.println(k);
		}
		else if(c=='m'){
			k= mul(a,b);
			System.out.println(k);
		}
		else if(c=='d'){
			k= div(a,b);
			System.out.println(k);
		}
		else {
		System.out.println("you enter wrong value");
		}
	}
	
	
	

	public static int add(int i,int j) throws IOException{
		System.out.println("program of sum..........");
			return i+j;
	}
	public static int sub(int i,int j) throws IOException {
		System.out.println("program of subtrection..........");
			return i-j;
	}
	public static int mul(int i,int j) throws IOException {
		System.out.println("program of mul ..........");
			return i*j;
	}
	public static int div(int i,int j) throws IOException {
		System.out.println("program of div..........");
			return i/j;
	}

}