package pleymoni.models;

import java.util.ArrayList;

public class User {
	private Integer userId;
	private String username;
	private String fName;
	private String lName;
	private Integer age;
	private Integer income;
	private Integer networth;
	private ArrayList<Expense> expenses = new ArrayList<>();
	
	// No args constructor
	public User() {
		super();
	}

	// Constructor minus networth argument
	public User(String username, String fName, String lName, Integer age) {
		super();
		this.username = username;
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}
	
	// All args constructor
	public User(String username, String fName, String lName, Integer age, Integer networth) {
		super();
		this.username = username;
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.networth = networth;
	}

	

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getIncome() {
		return income;
	}
	public void setIncome(Integer income) {
		this.income = income;
	}
	public Integer getNetworth() {
		return networth;
	}
	public void setNetworth(Integer networth) {
		this.networth = networth;
	}
	
	public ArrayList<Expense> getExpenses() {
		return expenses;
	}

	public void setExpenses(ArrayList<Expense> expenses) {
		this.expenses = expenses;
	}
	
	@Override
	public String toString() {
		return "User [username=" + username + ", fName=" + fName + ", lName=" + lName + ", age=" + age
				+", income=" + income + ", networth=" + networth + "\n expenses=" + expenses + "]";
	}
	
	
	
}
