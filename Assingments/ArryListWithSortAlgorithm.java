package Assingments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArryListWithSortAlgorithm {
	public static void main(String arg[]){
		System.out.println("hi");
		ArrayList<String> lst=new ArrayList();
		lst.add("Zahid");
		lst.add("Anwar");
		lst.add("Ali");
		lst.add("Yasir");
		lst.add("Amjad");
		Collections.sort(lst);
		// internal loops -java 8
		lst.forEach(name->System.out.println(name));

		// enhance loop which is external loop
		/*for(String st:lst){
			System.out.println(st);
		}*/


	}
}
