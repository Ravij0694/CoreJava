package loop;

public class Table {
	public static void main(String[]args) {
		tableByloop();
		Pstar();
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
	public static void Pstar() {
		for (int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
	
}
