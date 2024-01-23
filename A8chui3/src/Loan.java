// A8, Chi Heng Jeffrey Hui, CIS 340, T Th 3:00 PM
public class Loan {
	//Declare all fields 
	private double LoanAmount;
	private int numOfYears;
	private double annualInterestRate;
	private double monthlyPayment;
	private double totalPayment;

//Constructor
	public Loan() {
		annualInterestRate=5.0;
	}
	
	//Constructor with two parameters
	public Loan(double loanAmount, int year) {
		annualInterestRate=5.0;
		this.LoanAmount=loanAmount;
		this.numOfYears=year;
		
	}
	
	//Create the getmonthlyPayment method 
	public double getmonthlyPayment() {
		
	
	
	return monthlyPayment;
	
	}
	//Create setmonthlyPayment method 
	public void setmonthlyPayment() {
		//Calculate monthly interest rate 
		double monthlyInterestRate=annualInterestRate/1200;
		//Calculate monthly payment 
		this.monthlyPayment=LoanAmount*monthlyInterestRate/(1-(Math.pow(1/(1+monthlyInterestRate),numOfYears*12)));
	}
	//Create gettotalPayment method 
	public double gettotalPayment() {
		
		return totalPayment;
	}
	//Create settotalPayment method
	public void settotalPayment() {
		//Calculate the totalPayment
		this.totalPayment=monthlyPayment*12*numOfYears;
	}
	//Create getLoanAmount method
	public double getLoanAmount() {
		return LoanAmount;
	}
	
	
	

}