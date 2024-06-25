package DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Fileinputstream {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\Users\\Reliance\\eclipse-workspace\\javaselenium\\src\\COMMONDATA.properties");
	Properties p=new Properties();
	p.load(fis);
	String UN = p.getProperty("un");
	System.out.println(UN);
	String PWD = p.getProperty("pwd");
	System.out.println(PWD);
    String URl = p.getProperty("url");
    System.out.println(URl);

}
}
