package pleymoni.models;

public class MonthlyBudget {
	private Integer budgetId;
	private Integer budgeterId;
	private String month;
	private Double fixedExpenseBudget;
	private Double variableExpenseBudget;
	private Double discretionaryBudget;
	
	public MonthlyBudget() {
		// TODO Auto-generated constructor stub
	}

	public MonthlyBudget(Integer budgeterId) {
		this.budgeterId = budgeterId;
	}

	public Integer getBudgetId() {
		return budgetId;
	}

	public void setBudgetId(Integer budgetId) {
		this.budgetId = budgetId;
	}

	public Integer getBudgeterId() {
		return budgeterId;
	}

	public void setBudgeterId(Integer budgeterId) {
		this.budgeterId = budgeterId;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public Double getFixedExpenseBudget() {
		return fixedExpenseBudget;
	}

	public void setFixedExpenseBudget(Double fixedExpenseBudget) {
		this.fixedExpenseBudget = fixedExpenseBudget;
	}

	public Double getVariableExpenseBudget() {
		return variableExpenseBudget;
	}

	public void setVariableExpenseBudget(Double variableExpenseBudget) {
		this.variableExpenseBudget = variableExpenseBudget;
	}

	public Double getDiscretionaryBudget() {
		return discretionaryBudget;
	}

	public void setDiscretionaryBudget(Double discretionaryBudget) {
		this.discretionaryBudget = discretionaryBudget;
	}

	@Override
	public String toString() {
		return "MonthlyBudget [budgetId=" + budgetId + ", budgeterId=" + budgeterId + ", month=" + month
				+ ", fixedExpenseBudget=" + fixedExpenseBudget + ", variableExpenseBudget=" + variableExpenseBudget
				+ ", discretionaryBudget=" + discretionaryBudget + "]";
	}
	
	
	
}
