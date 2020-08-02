package designPatternPrototype;

public class PrototypeMain {
	public static void main(String args[]) throws CloneNotSupportedException {
		BookShop bs = new BookShop();
		bs.setShopName("Shop_XYZ");
		bs.setShopID(101);
		bs.loadBooks();
//		System.out.println(bs.getBookList());
		
		BookShop bs1 = bs.clone();
		bs1.setShopName("Shop_ABC");
		bs1.setShopID(102);
//		bs1.loadBooks();  not required as it already cloned the bs1
		
		bs.getBookList().remove(2);
		
		System.out.println(bs);
		System.out.println(bs.getBookList());
		System.out.println(bs1);
		System.out.println(bs1.getBookList());
	}
	
	
}
