package org.text;
class Doctor{
    float salary=50000;
}   	
    	
class Surgeon  extends Doctor{
	float bonus=20000; 
}
public class SuryaHW {
	public static void main(String[] args) {
		
   Surgeon s=new Surgeon();
	System.out.println("Salary of surgeon is"+ s.salary);	
	System.out.println();
	System.out.println("bonus of surgeon is"+ s.bonus);
		
	}

}
