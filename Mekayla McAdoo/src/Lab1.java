import java.util.Scanner;
import org.apache.poi.ss.formula.functions.FinanceLib;
//imports

public class Lab1 {

	public static void main(String[] args) {
		//All of my variables
		double f;
		double n;
		boolean t;
		double r;
		double p;
		double y;
		double In;
		double SSI;
		t = false;
		
		//Setting up my scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the interest rate during investment:");
		r = input.nextDouble();
		
		// Making sure rate is within limits
		while(r < 0){
			System.out.print("Interest rate cannot be a negative number. Input a rate 0 - 0.2");
			r = input.nextDouble();
		}
		while (r > 0.2){
			System.out.print("Interest rate cannot be greater that 20%. Input a rate 0 - 0.2");
			r = input.nextDouble();
		}
		//User inputs
		System.out.print("Enter the number of years you plan to work:");
		n = input.nextDouble();
		
		System.out.print("Enter the future value:");
		f = input.nextDouble();
		
		System.out.print("Enter the your income:");
		In = input.nextDouble();
		
		System.out.print("Enter the your expect Social Security Income:");
		SSI = input.nextDouble();
				
				
		//More Variables being redefined		
		double PV;
		r = (r/12);
		n = (n*12);
		y = (In-SSI);
		PV = FinanceLib.pv(r,n,y,f,t);
		
		//Printing out the Present Value
		System.out.print("Present Value is:");
		System.out.printf("%10.2f", PV);
		
		
		
		
		
		//Finding the payment
		double PMT;
		f = PV;
		System.out.println("Enter the Annual return during payback:");
		r = input.nextDouble();
		
		while(r < 0){
			System.out.println("Annual return  cannot be a negative number. Input a rate 0 - 0.03:");
			r = input.nextDouble();
		}
		while (r < 0.03){
			System.out.println("Interest rate cannot be greater that 3%. Input a rate 0 - 0.03:");
			r = input.nextDouble();
		}
		
		System.out.print("Enter the number of years in retirement:");
		n = input.nextDouble();
		
		n = (n*12);
		r = (r/12);
		p = 0;
		
		PMT = FinanceLib.pmt(r,n,f,p,t);
		System.out.print("Payment is:");
		System.out.printf("%10.2f", PMT);
	}

}
