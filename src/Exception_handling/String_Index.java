package Exception_handling;

public class String_Index {
public static void main(String[] args) {
	String s="Demo";
try {
	System.out.println(s.charAt(5));
}
catch(StringIndexOutOfBoundsException e) {
	System.out.println("SIOOB is handled successfully");
}
}
}
