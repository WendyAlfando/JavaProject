package main;

public class Product {

	private String watchID;
	private String watchName;
	private String watchBrand;
	private int watchPrice;
	private int watchStock;

	public Product(String watchID, String watchName, String watchBrand, int watchPrice, int watchStock) {
		super();
		this.watchID = watchID;
		this.watchName = watchName;
		this.watchBrand = watchBrand;
		this.watchPrice = watchPrice;
		this.watchStock = watchStock;
	}

	public String getWatchID() {
		return watchID;
	}

	public void setWatchID(String watchID) {
		this.watchID = watchID;
	}

	public String getWatchName() {
		return watchName;
	}

	public void setWatchName(String watchName) {
		this.watchName = watchName;
	}

	public String getWatchBrand() {
		return watchBrand;
	}

	public void setWatchBrand(String watchBrand) {
		this.watchBrand = watchBrand;
	}

	public int getWatchPrice() {
		return watchPrice;
	}

	public void setWatchPrice(int watchPrice) {
		this.watchPrice = watchPrice;
	}

	public int getWatchStock() {
		return watchStock;
	}

	public void setWatchStock(int watchStock) {
		this.watchStock = watchStock;
	}

}
