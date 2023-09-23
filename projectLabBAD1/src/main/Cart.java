package main;

public class Cart {
	private String userID;
	private String watchID;
	private int qty;

	public Cart(String userID, String watchID, int qty) {
		super();
		this.userID = userID;
		this.watchID = watchID;
		this.qty = qty;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getWatchID() {
		return watchID;
	}

	public void setWatchID(String watchID) {
		this.watchID = watchID;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

}
