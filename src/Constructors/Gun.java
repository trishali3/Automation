package Constructors;

public class Gun {
	String gunname;
	int noofbullets;
public Gun(String gunname,int noofbullets) { 
	this.gunname=gunname;
	this.noofbullets=noofbullets;
	
}
public void shoot() {
	for(int i=1;i<=noofbullets;i++) {
		System.out.println("Deshkew");
	}
	
}
	
	

}
