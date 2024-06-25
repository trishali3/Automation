package Collection;

import java.util.ArrayList;

public class Demo { 
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add("Trishali");
	al.add(10);
	al.add('A');
	al.add(null);
	System.out.println(al);
	//size
	System.out.println(al.size());
	//emptyornot
	System.out.println(al.isEmpty());
}	


}
