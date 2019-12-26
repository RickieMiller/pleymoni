package pleymoni.drivers;

import java.util.ArrayList;

import pleymoni.models.Expense;
import pleymoni.models.User;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User john = new User("john1","John", "Doe", 28);
		System.out.println(john);
		Expense expense1 = new Expense("Rent", 890, "Monthly rent cost", "recurring");
		Expense expense2 = new Expense("Car Note", 400, "Monthly rent cost", "recurring");
		Expense expense3 = new Expense("Car Insurance", 250, "Monthly rent cost", "recurring");
		Expense expense4 = new Expense("Netflix", 8, "Monthly rent cost", "recurring");
		Expense expense5 = new Expense("FrontendMasters", 24, "Monthly rent cost", "recurring");
		Expense expense6 = new Expense("Internet", 29, "Monthly rent cost", "recurring");
		ArrayList<Expense> exps = new ArrayList<>();
		exps.add(expense1);
		exps.add(expense2);
		exps.add(expense3);
		exps.add(expense4);
		exps.add(expense5);
		exps.add(expense6);
		john.setExpenses(exps);
		john.setIncome(2360);
		
		int total = 0;
		for (Expense exp : exps) {
			total += exp.getAmount();
		}
		john.setNetworth(john.getIncome() - total);
		System.out.println(john);

	}

}
