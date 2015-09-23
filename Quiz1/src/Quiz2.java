import java.util.Scanner;
import org.apache.poi.ss.formula.functions.FinanceLib;

public class Quiz2 {
	
		public static void main(String[] args) {
				//All of my variables
				double f;
				double n;
				boolean t;
				double r;
				double p;
				double y;
				double Tuition;
				double Payment;
				t = false;
				
				//Setting up my scanner
				Scanner input = new Scanner(System.in);
				System.out.print("Enter the initial tuition cost:");
				p = input.nextDouble();
				
				System.out.print("Enter percent increase for tuition:");
				r = input.nextDouble();
				
				//User inputs
				System.out.print("Enter the number of terms you completed:");
				n = input.nextDouble();
				
				System.out.print("Enter annual percent rate: ");
				f = input.nextDouble();
				
				System.out.print("Enter how many years do you want to pay it off by: ");
				y = input.nextDouble();
				
				//Finding total tuition for a degree
				Tuition = (p + (p*r))* n;
				
				System.out.print("Your total tuition is:");
				System.out.printf("%10.2f", Tuition);
						
				//More Variables being redefined		
				double PV;
				double PMT;
				
				
				n = (n*12);
				PV = Tuition;
				PMT = FinanceLib.pmt(f, y, 0, PV , t);
				Payment = PMT/12;
				
				//Printing out the Payment
				System.out.print("Your Payment is:");
				System.out.printf("%10.2f", Payment);				
				
		}

	}

