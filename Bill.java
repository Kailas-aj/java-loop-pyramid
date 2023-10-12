package kailas;
import java.util.*;
 class bil
 {
	 long cmr;
	 long pmr;
	 String name;
	 int id;
	 bil(int id,String name,long cmr,long pmr){
		 this .cmr=cmr;
		 this.pmr=pmr;
		 this.name=name;
		 this.id=id;
		 System.out.println("The current bill ");
		 System.out.println("C id :" +id+"\n"+"C Name :"+name+"\n"+"\n"+"current reading :"+cmr+"\n"+"previous reading:"+pmr);
		
		 
		 
	 }
	
 }
 class last extends bil
 
 {
	 
	last(int id, String name, long cmr, long pmr) {
		super(id, name, cmr, pmr);
		
		
		
		}
	void con()
	{
	     long vv=super.cmr-super.pmr;
	     if(vv>500) {
	    	  System.out.println(" Pay Amount:uts*20:"+  vv*20+"/.");
	     }
	     else if(vv<=500&&vv>200) {
	    	 System.out.println(" Pay Amount:uts*10:"+   vv*10+"/.");
	    	 
	     }
	     else if(vv<=200&&vv>100) {
	    	 System.out.println(" Pay Amount:uts*5:"+ vv*5+"/.");
	    	 
	     }
	     else if(vv<=100&&vv>0) {
	    	 System.out.println(" Pay Amount:uts*2:"+   vv*2+"/.");
	    	 
	     }
	     else {
	    	 System.out.println("you don't have to pay bill because current bill is less than previous bill ");
	     }
		System.out.println("THANK YOU AND HAVE A NICE DAY");
	}
	
	

	
 }
 

public class Bill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter  C id no 2 digits");
		 int idd=sc.nextInt();
		 System.out.println("enter C Name");
		 String n=sc.next();
		 System.out.println(" enter current reading");
		 long r=sc.nextLong();
		 System.out.println("enter previous reading");
		 long p=sc.nextLong();
		 
		 last obj=new last(idd,n,r,p);
		 obj.con();
		 
		
	}

}
