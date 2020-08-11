package genericsExample;

import genericsExample.MyOwnList;

public class GenericsExample {
	public static void main(String args[]) {
		MyOwnList<String> list = new MyOwnList<>();
		list.addElements("Test1");
		list.addElements("Test2");
		list.removeElements("Test1");
		
		
		MyOwnList<Integer> list2 = new MyOwnList<>();
		list2.addElements(1);
		list2.addElements(2);
		list2.removeElements(1);
	}
}
