package pleymoni.models;

public class Expense {
	private String name;
	private int amount;
	private String description;
	private String category;
	
	public Expense() {
		
	}

	public Expense(String name, int amount, String description, String category) {
		super();
		this.name = name;
		this.amount = amount;
		this.description = description;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Expense: name=" + name + ", amount=" + amount + ", description=" + description + ", category="
				+ category+ "\n";
	}
	
	
}
