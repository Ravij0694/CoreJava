package string;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java .util.*;

public class date {
/**
 * @param args
 * @throws ParseException
 */
public static void main(String[] args) throws ParseException {
     Date d = new Date()	;
     System.out.println(d);
   
     SimpleDateFormat f = new  SimpleDateFormat("dd/MM/yy");
     String s =f.format(d);
     System.out.println(s);
     
       String s1 = "04/02/2022" ;
     Date d1 = f.parse(s1);

String s3="13/01/1992";
Date d2 = f.parse(s3);
     

      calDat(d,d2);
     //compr(d,d1);
     //caldr(c);
   
  
  
}
public static void calDat(Date d1,Date d2) {
	   Calendar c= Calendar.getInstance();
	     c.setTime(d1);
	     int year =c.get(Calendar.YEAR);
	     int month =c.get(Calendar.MONTH);
	     int date =c.get(Calendar.DATE);
	     
	     c.setTime(d2);
	     int year1 =c.get(Calendar.YEAR);
	     int month1 =c.get(Calendar.MONTH);
	     int date1 =c.get(Calendar.DATE);
	     
	     
	     System.out.println("year "+(year-year1));
	     System.out.println("month "+(month-month1));
	     System.out.println("day "+(date-date1));

       
} 
public static void compr(Date d,Date d1) {
	System.out.println("Startdate  "+d1);
    System.out.println("end date  "+d);
    if( d.before(d1));
 {
	  System.out.println("End date is greter");
 }
}
public static void caldr(Calendar c) {
	 for (int i=0;i<12;i++) {
	     c.add(Calendar.DATE,30); 
	     Date n=c.getTime();System.out.println(n);
	    }
}
}
