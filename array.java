package kailas;
import java.util.*;
public class array {

	public static void main(String[] args) {
	 Scanner ob= new Scanner(System.in);
	 System.out.println("enter a size");
	 long sc=ob.nextLong();
	 long ar[]=new long[(int) sc];	
	 System.out.println("enter array number");
	  for( int i=0;i<ar.length;i++) 
	  {
		  ar[i]=ob.nextLong();
		             
	  }
	 
	  
	  for(int t=0;t<ar.length;t++) 
	  {
		  for(int p=t+1;p<ar.length;p++) 
		  {
			  if(ar[t]<ar[p]) 
			  {
				 long tm=ar[p];
				 ar[p]=ar[t];
				 ar[t]=tm;
				  
			  }
		  }
	  }
	 for(int y=0;y<=ar.length;y++) 
	 {
		 System.out.println(ar[y]);
	 }
	 }
	
}
