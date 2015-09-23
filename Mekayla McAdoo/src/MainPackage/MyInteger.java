package MainPackage;

public class MyInteger{
	
	public int getValue() {
		return value;
	}
	
	private int value;
	private double myList[];
	private double String;
	
	//Constructor
	public MyInteger(int value){
			this.value = value;
	}

	
	public boolean isEven(){
		if (this.getValue() % 2 == 0){
			return true;
				}
		else{
			return false;
				}
	}
					
	public boolean isOdd(){
		if (this.getValue() % 2 != 0){	
			return true;
			}
		else{
			return false;
		}
	}
	
	public boolean isPrime(){
		for(int i = 2 ; 1 < this.getValue() ; i++){
			if(this.getValue() % i == 0 ){
				return false;
			}
		}
		return true;
	}
	public static boolean isPrime(int value){
		for(int i = 2 ; 1 < value ; i++){
			if(value % i == 0 ){
				return false;
			}
		}
		return true;		
	}
	
	public static boolean isOdd(int value){
		if (value % 2 != 0){	
			return true;
			}
		else{
			return false;
		}

	}
	public static boolean isEven(int value){
		if (value % 2 == 0){	
			return true;
			}
		else{
			return false;
		}
	}

	public static boolean isPrime(MyInteger myInt){
		for(int i = 2 ; 1 < myInt.getValue() ; i++){
			if(myInt.getValue() % i == 0 ){
				return false;
			}
		}
		return true;		
	}
	
	public static boolean isOdd(MyInteger myInt){
		if (myInt.getValue() % 2 != 0){	
			return true;
				}
		else{
			return false;
					}
			}
	public static boolean isEven(MyInteger myInt){
		if (myInt.getValue() % 2 != 0){	
			return true;
		}else{
			return false;
		}
			}
	public boolean equals(MyInteger myInt){
		if (myInt.getValue() == value){
			return true;
		} else {
			return false;
				}
			}

	public boolean equals(int value){
		if (getValue() == value){
			return true;
			} 
		else {
			return false;
				}
			}
	
	public static double parseInt(char[] myList){
		double total = 0;
		for(int i = 0; i < myList.length; i++){
			total += myList[i];
		}
		return total;
		}


	public static double parseInt(String str){
		double total = 0;
		for(int i = 0; i < String.length; i++){
			total += String[i];
		}
		return total;
		}
}

