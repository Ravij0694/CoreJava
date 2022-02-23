package exceptionhen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ExceptionEx {
public static void main(String []args) throws IOException {
InputStream  in=null;
String name ="vijay dinanath";
try {
	System.out.println(name.length());
	System.out.println(name.charAt(14));
	in=new FileInputStream("file.txt");
	int d =in.read();
	while (d!=-1) {
		System.out.print((char)d);
		d=in.read();
	}
	
}
catch(NullPointerException e) {
	System.out.println("name can not be null");
	
}
catch(RuntimeException e) {
	System.out.println("small size of String");
	System.out.println(e.getMessage());
}
catch(FileNotFoundException e) {
	System.out.println("file not found");
}

finally {
	if(in!=null) {
		in.close();
	}
}
boolean uf = validuser();
if(uf) {
	System.out.println("validuser");
}
else {
	RuntimeException e=new RuntimeException("invalid user");throw e;
}
}
	public static Boolean validuser() {
		return false                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ;
	}	
	
}
