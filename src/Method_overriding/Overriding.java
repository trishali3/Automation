package Method_overriding;

public class Overriding {
public static void main(String[] args) {
	Morning m=new Morning();
	m.wish();
	Evening e=new Evening();
	e.wish();
	Morning mg=new Evening();//overriding approach
	mg.wish();
}	

}
