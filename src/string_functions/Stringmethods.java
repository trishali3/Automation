package string_functions;

public class Stringmethods{
public static void main(String[] args) {
	String s1="ATOMSPHERE";
	String s2="atomsphere";
	String s3="sphere";

//length()>>it will count characters in string
	System.out.println(s1.length());
//toUppercase()>>it  will converts string into uppercase
	System.out.println(s2.toUpperCase());
//toLowercase()>>convert sting into lowercase
	System.out.println(s1.toLowerCase());
//equals()>> it compares 2 stings
	System.out.println(s1.equals(s2));
//equalIgnorecase()>>it will not bother about the cases
	System.out.println(s1.equalsIgnoreCase(s2));
//contains()>>check whether the string is present in another string or not
	System.out.println(s2.contains(s3));

//charAt()>>it will give the character of particular index	
	System.out.println(s3.charAt(5));
//IndexOf()>>it will give index of particular character
	System.out.println(s2.indexOf("p"));
//startsWith()>>//checks whether the string is starts with particular character or not
	System.out.println(s3.startsWith("s"));
//endsWith()>>checks whether the string is endss with particular character or not
	System.out.println(s3.endsWith("e"));
//concat()>>it is used to jion 2 strings
	System.out.println(s3.concat(s1));
//replace()>>it replaces particular character
	System.out.println(s1.replace("SPHERE","CITY"));
}

}
