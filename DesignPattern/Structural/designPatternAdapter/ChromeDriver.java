package designPatternAdapter;

class ChromeDriver implements WebDriver {

	  @Override
	  public void getElement() {
	    System.out.println("Get element from ChromeDriver");
	  }

	  @Override
	  public void selectElement() {
	    System.out.println("Select element from ChromeDriver");
	    
	  }
	  
}
