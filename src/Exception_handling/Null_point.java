package Exception_handling;

public class Null_point {
int i=10;
public static void main(String[] args) {
	Null_point n=null;
try{
	
	System.out.println(n.i);
}
catch(NullPointerException e) {
	System.out.println("NPE is handled successfully");
}
		
	}

}
