//while running the program, we can pass values from outside.. jvm takes those values at args and store those values in array.
//javac Program03.java .. then java Program03 Hello Shweta
// output will be :-
// Hello
// Shweta


class Program03{
	public static void main(String[] args){
		System.out.println(args[0]);
		System.out.println(args[1]);
	}
}
