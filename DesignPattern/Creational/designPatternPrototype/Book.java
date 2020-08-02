package designPatternPrototype;

public class Book {
	private int bID;
	private String bName;
	public int getbID() {
		return bID;
	}
	public void setbID(int bID) {
		this.bID = bID;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	@Override
	public String toString() {
		return "Book [bID=" + bID + ", bName=" + bName + "]";
	}
	
}
