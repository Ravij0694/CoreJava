package account;

public class Testacc {
public static void main(String []args) {
	Person p= new Person();
	Acco a= new Acco();
	automob am = new automob();
	p.setname("ram");
	p.setage (25);
	p.setdob("22.10.99");
    p.setadd("gr.post-bhatkhedi");
    System.out.println("Name  "+p.getname());
    System.out.println("Addrese "+p.getadd());
    System.out.println("DOB "+p.getdob());
    System.out.println("Age "+p.getage());
    
    
      
    a.setAccNo("145276534");
    a.setAccType("saving");
    a.setBal(25765.9);
    System.out.println("Acont no "+a.getAccNo());
    System.out.println("a/c type  "+a.getAccType());
    System.out.println("Balence  "+a.getBal());
    
    int wdr =2000; 
    a.withdrawal(wdr);
    System.out.println("withdral "+wdr+"currnt bal "+a.getBal());
    int depo=3000;
    a.deposit(depo);
    System.out.println("deposit  "+depo+"new balence "+a.getBal());
   
    am.setcolour("blue");
    am.setgear(4);
    am.setmake("maruti");
    am.setspeed(120);
    System.out.println("colur "+am.getcolour());
    System.out.println("gear "+am.getgears());
    System.out.println("make By "+am.getmeke());
    System.out.println("Speed "+am.getspeed());
    am. changGear(3);
   am.brack();
   System.out.println("Balence  "+a.getBal());a.withdrawal(26300); System.out.println("Balence  "+a.getBal()); 
}   
}
