package designPatternPrototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
	String shopName;
	int shopID;
	List<Book> bookList = new ArrayList<>();
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public int getShopID() {
		return shopID;
	}
	public void setShopID(int shopID) {
		this.shopID = shopID;
	}
	public List<Book> getBookList() {
		return bookList;
	}
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	public void loadBooks() {
		for(int i = 1; i <= 5; i++) {
			Book book = new Book();
			book.setbID(i);
			book.setbName("Book" + i);
			// getBookList().add(book); OR
			bookList.add(book);
		}
	}
	
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", shopID=" + shopID + "]";
	}
	
	public BookShop clone() throws CloneNotSupportedException{
		BookShop shop = new BookShop();
		for(Book b : this.getBookList())
			shop.getBookList().add(b);
		return shop;
	}
	
}
