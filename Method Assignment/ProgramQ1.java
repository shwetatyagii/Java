/*1. Design a method which will take two arguments and will
a. add
b. multiply
c. subtract
d. divide
and will print the result. */

class ProgramQ1{
	public static void main(String[] args){
		add(10,5);
		subtract(20,10);
		multiply(5,5);
		divide(10,2);
	}

	public static void add(int a, int b){
		System.out.println("Sum of "+a+ " and "+b+ " is : "+ (a+b));
	}  
	public static void subtract(int a, int b){
		System.out.println("Difference of "+a+ " and "+b+ " is : "+ (a-b));
	}  
	public static void multiply(int a, int b){
		System.out.println("Product of "+a+ " and "+b+ " is : "+ (a*b));
	}  
	public static void divide(int a, int b){
		if(b != 0){
		System.out.println("Division of "+a+ " and "+b+ " is : "+ (a/b));
		}
		else {
		System.out.println("Cannot divide by Zero");
		}
	}  
}