package Exception_handling;


public class Array_index {
public static void main(String[] args) {
	String a[]=new String[4];
	a[0]="DEMO";
	a[1]="SUMO";
	a[2]="REMO";
	a[3]="POMO";
try {	
	System.out.println(a[4]);
}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("AIOOBE is handled successfully");
}
	
	
	
	
}

}
