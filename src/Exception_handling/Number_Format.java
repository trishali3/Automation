package Exception_handling;

import java.text.NumberFormat;

public class Number_Format{
public static void main(String[] args) {
	try {
	System.out.println(Integer.parseInt("2k24"));
}	
catch(NumberFormatException e) 
	{
		System.out.println("NF is handled succesfully ");
	}
}
}
