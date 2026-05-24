//string program .. pass argument from command line .. for each loop will print

class Program13{
	public static void main(String[] args){
		System.out.println("Program starts");
		System.out.println(args.length);
		for(String x:args){
			System.out.println(x);
		}
		System.out.println("program ends!!");
	}
}