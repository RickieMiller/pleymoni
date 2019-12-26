package pleymoni.models;

public class Transaction {
	private Integer transId;
	private String customer;
	private Double amount;
	private String category;
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public Transaction(String customer, Double amount, String category) {
		super();
		this.customer = customer;
		this.amount = amount;
		this.category = category;
	}

	public Integer getTransId() {
		return transId;
	}

	public void setTransId(Integer transId) {
		this.transId = transId;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Transaction [transId=" + transId + ", customer=" + customer + ", amount=" + amount + ", category="
				+ category + "]";
	}
	
	
}
