package genericsExample;

import java.util.ArrayList;

public class MyOwnList<T> {
//	ArrayList<String> myList = new ArrayList<>();
//	public void addElements(String element) {
//		myList.add(element);
//	}
//	public void removeElements(String element) {
//		myList.remove(element);
//	}
	
	ArrayList<T> myList = new ArrayList<>();
	public void addElements(T element) {
		myList.add(element);
	}
	public void removeElements(T element) {
		myList.remove(element);
	}
}
