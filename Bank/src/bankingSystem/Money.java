package bankingSystem;

public class Money {
	int money;

	public int getMoney(Actor actor) {
		if(actor.isAllowedToViewMoney()) {
			return money;			
		}
		return -1;
	}

//	public void setMoney(Actor ) {
//		this.money = money;
//	}
	
}
