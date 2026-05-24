//it is a string program .. you need to pass args from command line (example:- java Program10 Mohan Sohan 12 18.3 abc)

class Program10{
	public static void main(String[] args){
		System.out.println("========Java Application Starts==========");
		System.out.println(args);
		System.out.println(args.length);
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[0].length());
		System.out.println(args[args.length-1].length());
		System.out.println("=========Java Application Ends=========");
	}
}


