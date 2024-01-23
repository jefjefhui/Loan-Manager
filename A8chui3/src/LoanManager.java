// A8, Chi Heng Jeffrey Hui, CIS 340, T Th 3:00 PM
import java.util.Scanner;

public class LoanManager {
Scanner scanner = new Scanner (System.in );
//Create an array with size of 10
private Loan[] listOfLoan=new Loan[10];
private String input;


	public static void main(String[] args) {
		//create object reference
		LoanManager newLoanObject=new LoanManager();
		//call all the required methods
		newLoanObject.printHeader();
		newLoanObject.loanLoop();
		newLoanObject.displayLoan();
		
	
		
		

}
	//print out the header 
	public void printHeader() {
		System.out.print("\t\t\tFirst National Loans");
	}
	int i=0;
	//create the loanInformation method
	public void loanInformation() {
		//declare local variables 
		double loanAmount;
		int years;
		//ask user to enter loan amount and years.
		System.out.print("\n\n\nEnter loan amount:");
		loanAmount=Double.parseDouble(scanner.nextLine());
		System.out.print("Enter number of years:");
		years=Integer.parseInt(scanner.nextLine());
		//Declare and instantiate new object 
		Loan newloan=new Loan(loanAmount,years);
		//call the setmonthlyPayment and settotalPayment for the new object 
		newloan.setmonthlyPayment();
		newloan.settotalPayment();
		//print out the total payment
		System.out.printf("The total payment on this loan will be $%.2f",newloan.gettotalPayment());
		//add the object to the array
		listOfLoan[i]=newloan;
		//increment i
		i++;
		//Ask user if they want to continue or not 
		System.out.print("\n\nDo you want to apply for another loan?(Y/N):");
		input=scanner.nextLine();
	}
	
	//Create the loanLoop method
	public void loanLoop() {
		//Create do while loop, and implement loanInformation method inside 
		do {
			loanInformation();
		}while(!input.equalsIgnoreCase("N"));
	}
	//Create displayLoan method
	public void displayLoan() {
		System.out.print("\nFollowing are the loans in the system.");
		System.out.print("\nAmount         Total Payment\n");
		double sum=0;
		//Use for loop to loop through through the array.
		//Print all require values
		//add all total payment together 
		for (int j=0;j<i;j++) {
			Loan L=listOfLoan[j];
			System.out.printf("%.2f        %.2f\n",L.getLoanAmount(),L.gettotalPayment());
			sum+=listOfLoan[j].gettotalPayment();
		
		}
		
		//Print out the sum of all total payment.
		System.out.printf("\nThe total payment of all loans is $%.2f",sum);
		System.out.println("\nPress Enter to exit...");
		scanner.nextLine();
	}
	
}