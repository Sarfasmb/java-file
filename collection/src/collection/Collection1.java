package collection;
import java.util.ArrayList;
import java.util.Collections;
public class Collection1 {
	public static void main (String[] args) {
		ArrayList s1= new ArrayList();
		s1.add( 10);
		s1.add( 20);
		s1.add( 30);
		s1.add( 40);
		System.out.println("s1"+s1);
		
		ArrayList s2= new ArrayList();
		s2.add(20);
		s2.add( 30);
		s2.add( 10);
		s2.add( 40);
		Collections.sort(s2);
		System.out.println("s2"+s2);
		
	 
	}

}
