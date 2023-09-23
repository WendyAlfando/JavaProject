package main;

public class TransactionDetail {
	private Integer transactionID,watchId;
	private String watchName,watchBrand;
	private Integer watchPrice,quantity,subTotal;
	public TransactionDetail(Integer transactionID, Integer watchId, String watchName, String watchBrand,
			Integer watchPrice, Integer quantity, Integer subTotal) {
		super();
		this.transactionID = transactionID;
		this.watchId = watchId;
		this.watchName = watchName;
		this.watchBrand = watchBrand;
		this.watchPrice = watchPrice;
		this.quantity = quantity;
		this.subTotal = subTotal;
	}
	public Integer getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(Integer transactionID) {
		this.transactionID = transactionID;
	}
	public Integer getWatchId() {
		return watchId;
	}
	public void setWatchId(Integer watchId) {
		this.watchId = watchId;
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
	public Integer getWatchPrice() {
		return watchPrice;
	}
	public void setWatchPrice(Integer watchPrice) {
		this.watchPrice = watchPrice;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(Integer subTotal) {
		this.subTotal = subTotal;
	}
	
	
	

}
