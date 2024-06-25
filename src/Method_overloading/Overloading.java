package Method_overloading;

public class Overloading {
public static void main(String[] args) {
 add(10 ,20);
 add(12,13,15);
}	
public static void add(int a, int b) {
	int c=a+b;
	System.out.println(c);
}
public static void add(int x, int y ,int z) {
	int s=x+y+z;
	System.out.println(s);
}

	
}
